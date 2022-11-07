package com.anurag.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        count(arr);
    }

    static void count(int[] arr){
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            int key = arr[i];
            if(hm1.containsKey(key)){
                int count = hm1.get(key);
                count = count+1;
                hm1.put(key, count);
            }else{
                hm1.put(key,1);
            }
        }
        System.out.println(hm1);

        //How to iterate over hashmap

    }

}
