package com.anurag;

import java.util.Scanner;

public class FamousSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        long k = sc.nextLong();
        long sum =0;
        for(int i =0; i<n.length() ; i++){
            System.out.println((n.charAt(i) -48));
            sum = sum + (n.charAt(i) -48);
//            System.out.println(sum);
        }
    }
}
