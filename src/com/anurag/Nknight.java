package com.anurag;

import java.util.Scanner;

public class Nknight {
    static boolean[][] flag = new boolean[3][3];
    static int stepCount =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int n = sc.nextInt();
        steps(i-1, j-1, n);
        steps(i-1, j-1, n);
        int count =0;
        for(int l=0; l<3; l++){
            for(int m=0; m<3; m++){
                if(flag[l][m] == true){
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(stepCount);
    }

    private static void steps(int i, int j, int n) {
        if(i<0 || i>2 || j<0 || j>2){
            stepCount++;
            return;
        }
        else if(n==0){
            flag[i][j] = true;
            stepCount++;
            return;
        }
        else{
            steps(i-2, j+1, n-1);
            steps(i-2, j-1, n-1);
            steps(i-1, j+2, n-1);
            steps(i-1, j-2, n-1);
            steps(i+1, j+2, n-1);
            steps(i+1, j-2, n-1);
            steps(i+2, j-1,n-1);
            steps(i+2, j+1, n-1);
        }
    }

}
