package com.anurag.practice;

public class FloorValue {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 12, 14 };
        int target = 7;
        System.out.println(floor(arr, arr.length, target));
    }

    static int floor(int[] arr , int n , int target){
        int start = 0;
        int end = n-1;
        int value = Integer.MIN_VALUE;
        while (start<= end){

            int mid = (start + end)/2;

            if(arr[mid] < target){
                value = arr[mid];
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
        }
        return value;
    }
}
