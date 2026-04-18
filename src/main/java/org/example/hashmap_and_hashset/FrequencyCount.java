package org.example.hashmap_and_hashset;

import java.util.HashMap;

public class FrequencyCount {
    public HashMap<Integer, Integer> frequencyCount(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map;
    }
}
