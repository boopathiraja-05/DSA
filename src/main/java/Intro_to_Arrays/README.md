# 🔄 Array Rotation (Java)

A simple and efficient implementation of **array rotation using the reversal algorithm** in Java.

---

## 📌 Problem Statement

Given an array of size `n` and an integer `k`, rotate the array to the **right by k steps**.

---

## 🧠 Example


Input:
arr = [1, 2, 3, 4, 5]
k = 2

Output:
[4, 5, 1, 2, 3]


---

## 🚀 Approach: Reversal Algorithm

Instead of shifting elements one by one (which is inefficient), we use **array reversal**.

### Steps:
1. Reverse the entire array  
2. Reverse first `k` elements  
3. Reverse remaining elements  

---

## ⚙️ Code Implementation

### 🔹 Rotate Array

```java
public int[] rotateArray(int[] arr, int n, int k) {
    if (n == 0) return arr;

    k = k % n;

    // Step 1: Reverse whole array
    reverse(arr, 0, n - 1);

    // Step 2: Reverse first k elements
    reverse(arr, 0, k - 1);

    // Step 3: Reverse remaining elements
    reverse(arr, k, n - 1);

    return arr;
}


🔹 Reverse Helper Function
void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
🧪 Dry Run
arr = [1,2,3,4,5], k = 2

Step 1: [5,4,3,2,1]
Step 2: [4,5,3,2,1]
Step 3: [4,5,1,2,3]
⏱️ Complexity
Type	Value
Time	O(N)
Space	O(1)
⚠️ Edge Cases
k > n → use k % n
n = 0 → return array
k = 0 → no change
