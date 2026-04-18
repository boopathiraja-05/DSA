package Intro_to_Arrays;

public class RotateArray {

    public int[] rotateArray(int[] arr, int n ,int k) {
            k = k % n;
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            return arr;
    }

    void reverse(int[] arr, int start, int end){
            int i = start;
            int j = end;
            while (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

    }
}
