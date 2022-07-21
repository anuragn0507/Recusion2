package com.anurag;

import java.lang.reflect.Array;
import java.util.*;

public class Nways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int l=0; l<n; l++){
            int num = sc.nextInt();
            arr.add(num);
        }
        List<List<Integer>> ans = numberOfWays(arr, n, k);
        if(ans.size() ==0){
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < ans.size(); i++) {
            List<Integer> ele = new ArrayList<>();
            for (int j = 0; j < ele.size(); j++) {
                System.out.println(ele.get(j));
            }

        }
    }

    static List<List<Integer>> numberOfWays(ArrayList<Integer> arr, int n, int k){
        int sum = k;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);
        numWays( ans, arr, sum, 0, temp);
        return ans;
    }

    static void numWays(List<List<Integer>> ans,List<Integer> arr, int sum, int index,  List<Integer> temp ){
        if(sum == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        else if(sum < 0){
            return;
        }

        for(int i=index; i< arr.size(); i++){
            if((sum - arr.get(i) )>= 0) {
                temp.add(arr.get(i));

                numWays(ans, arr, sum - arr.get(i), i, temp);
                temp.remove(arr.get(i));
            }
        }
    }


}
