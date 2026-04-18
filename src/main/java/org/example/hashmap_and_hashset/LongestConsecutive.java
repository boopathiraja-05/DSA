package org.example.hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int num : set) {
            if (!set.contains(num-1)) {
                int current = num;
                int length = 1;
                while (set.contains(current + 1)) {
                    current = current + 1;
                    length = length + 1;
                }
                max = Math.max(max, length);
            }
        }
        return max;
    }
}
