package com.anurag;

import java.util.Scanner;

public class Main {

        static boolean[][] flag = new boolean [10][10];

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int i = 3;
            int j = 8;
            int n = 5;
            path(i-1,j-1,n);
            int count =0;

            for(int l=0; l<10; l++){
                for(int m=0; m<10; m++){
                    if(flag[l][m] == true){
                        count++;
                    }
                    //  System.out.print(flag[l][m]+ " ");
                }
                //  System.out.println();

            }
            System.out.println(count);

        }

        public static void path(int i, int j, int n){
            if(i<0 || j>9 || j<0 || j>9){
                return;
            }
            else if((n==0)){
                flag[i][j] = true;
                return;
            }

            else{
                path(i-2, j+1, n-1);
                path(i-2, j-1, n-1);
                path(i+2, j+1, n-1);
                path(i+2, j-1, n-1);
                path(i-1, j+2, n-1);
                path(i-1, j-2, n-1);
                path(i+1, j-2, n-1);
                path(i+1, j+2, n-1);
            }
        }

}
