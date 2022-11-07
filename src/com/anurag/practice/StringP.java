package com.anurag.practice;

import java.util.Arrays;
import java.util.Locale;

public class StringP {
    public static void main(String[] args) {
        String[] str = {"an", "ur" , "ag"};
        String[] newStr = new String[str.length];
        for(int i=0; i< args.length; i++){
            newStr[i] = str[i].toUpperCase();
        }
        System.out.println(Arrays.toString(newStr));

    }
}
