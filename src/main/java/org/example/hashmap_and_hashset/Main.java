package org.example.hashmap_and_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
       int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
//       duplicate obj = new duplicate();
//       System.out.println(obj.duplicate(arr));

//       FrequencyCount obj1 = new FrequencyCount();
//       System.out.println(obj1.frequencyCount(arr));

//       TwoSum obj2 = new TwoSum();
//       System.out.println(Arrays.toString(obj2.twoSum(arr, 9)));

        LongestConsecutive obj3 = new LongestConsecutive();
        System.out.println(obj3.longestConsecutive(arr));



    }
}
