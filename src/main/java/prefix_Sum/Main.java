package prefix_Sum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        PrefixSum prefixSum = new PrefixSum();
        System.out.println(Arrays.toString(prefixSum.prefixSum(arr)));
    }
}
