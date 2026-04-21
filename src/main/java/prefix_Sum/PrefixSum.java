package prefix_Sum;

public class PrefixSum {
    public int[] prefixSum(int[] arr) {
        int n = arr.length;
        int pf[] = new int[n];
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        return pf;
    }
}
