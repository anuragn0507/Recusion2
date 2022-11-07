package com.anurag.practice;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Anurag");
        sb.append("Yadav");
        sb.insert(1, "n");
        System.out.println(sb.toString());

        sb.replace(1, 1, "nnnn");
        System.out.println(sb.toString());
        sb.delete(1,4);
        System.out.println(sb.toString());
    }
}
