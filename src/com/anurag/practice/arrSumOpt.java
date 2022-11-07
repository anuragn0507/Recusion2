package com.anurag.practice;


public class arrSumOpt {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k=4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }

    static int maxSum(int[] arr, int n, int k ){
        int max_value = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i=0; i<k; i++){
            curr_sum= curr_sum + arr[i];
        }
        max_value = curr_sum;
        for(int i=0; i<n-k; i++){
            curr_sum = curr_sum - arr[i] + arr[i+k];
            max_value = Math.max(curr_sum, max_value);
        }
        return  max_value;
    }
}
