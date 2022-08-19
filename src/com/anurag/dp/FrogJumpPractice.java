package com.anurag.dp;

import java.util.Arrays;

public class FrogJumpPractice {
    public static void main(String[] args) {
        int[] height = {30, 10, 60, 10, 60, 50};
        int n = height.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(solve(height, n-1, dp));
    }

    static int solve(int[] height, int n, int[] dp){
        if(n==0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int jumpTwo = Integer.MAX_VALUE;

        int jumpOne = solve(height, n-1, dp) + Math.abs(height[n] - height[n-1]);
        if(n>1){
            jumpTwo = solve(height, n-2, dp) + Math.abs(height[n]- height[n-2]);
        }
        return dp[n] = Math.min(jumpOne, jumpTwo);
    }
}
