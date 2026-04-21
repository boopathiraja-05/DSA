package Intro_to_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int n = sc.nextInt();

      System.out.println("Enter the number of rotations:");
      int k = sc.nextInt();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          System.out.println("Enter element " + (i + 1) + ":");
        arr[i] = sc.nextInt();
      }
      // first problem - Print All Elements
      for (int i = 0; i < n; i++) {
          System.out.println("Element " + (i + 1) + ":");
        System.out.println(arr[i]);
      }

//      ReverseAllElements obj = new ReverseAllElements();
//      System.out.println("Reversed array:");
//      System.out.println(Arrays.toString(obj.reverseallElements(arr, n)));

//      RotateArray obj2 = new RotateArray();
//      System.out.println("Rotated array:");
//      System.out.println(Arrays.toString(obj2.rotateArray(arr, n , k)));

      Remove_Duplicates_from_sorted_array obj3 = new Remove_Duplicates_from_sorted_array();
      System.out.println("Array with duplicates removed:");
      System.out.println((obj3.removeDuplicates(arr)));


  }
}
