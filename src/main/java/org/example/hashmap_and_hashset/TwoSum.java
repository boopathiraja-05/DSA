package org.example.hashmap_and_hashset;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] arr, int i) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
           int need = i - arr[j];
           if (map.containsKey(need)) {
               return new int[] { map.get(need), j };
           }
           map.put(arr[j], j);
        }
        return  new int[] {};
    }
}
