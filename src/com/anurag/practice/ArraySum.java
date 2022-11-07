package com.anurag.practice;

public class ArraySum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k=4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }

    private static int  maxSum(int[] arr, int n, int k) {
        int max_value = Integer.MIN_VALUE;

        for(int i=0; i< n-k+1; i++){
            int curr_sum = 0;
            for(int j=0; j<k; j++){
                curr_sum = curr_sum + arr[i+j];
                max_value = Math.max(curr_sum, max_value);
            }
        }
        return max_value;
    }
}
