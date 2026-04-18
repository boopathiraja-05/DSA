package Intro_to_Arrays;

public class ReverseAllElements {
    public int[] reverseallElements(int arr[], int n){
        reverse(arr,0,n);

        return arr;
    }

    void reverse(int arr[], int start, int end){
      int i = start;
      int j = end - 1;
      while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
      }
    }

}
