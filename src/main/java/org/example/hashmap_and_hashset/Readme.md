# 📘 HashMap & HashSet – Java Guide

A beginner-friendly and interview-focused guide to understanding and using **HashMap** and **HashSet** in Java.

---

## 📚 Table of Contents

- HashSet
- HashMap
- HashSet vs HashMap
- Decision Rule
- Key Patterns
- Practice Problems

---

# 🔥 HashSet

## 🧠 What is HashSet?
HashSet is a collection that stores **unique elements only**.

- ❌ No duplicates allowed  
- 🔀 Order is not guaranteed  
- ⚡ Fast lookup (O(1))  

👉 Think: **"Have I seen this before?"**

---

## ⚙️ Syntax
java
HashSet<Integer> set = new HashSet<>();

---

## 🛠️ Common Operations

- set.add(10);        // Add element
- set.contains(10);   // Check existence
- set.remove(10);     // Remove element
- set.size();         // Get size

---

## 🧩 Example: Check Duplicate
public boolean hasDuplicate(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    
    for (int num : arr) {
        if (set.contains(num)) return true;
        set.add(num);
    }
    return false;
}

---

## 🎯 Use Cases
- Duplicate detection
- Unique elements
- Fast existence checking
- Longest consecutive sequence

---

# 🔥 HashMap
## 🧠 What is HashMap?

HashMap stores key → value pairs

- Keys are unique
- Values can be duplicate
- Order is not guaranteed
- Fast lookup → O(1)

### 👉 Think: "How many / where / what relation?"

---

## ⚙️ Syntax
HashMap<Integer, Integer> map = new HashMap<>();

---

## 🛠️ Common Operations
- map.put(1, 10);         // Add/update
- map.get(1);             // Get value
- map.containsKey(1);     // Check key
- map.remove(1);          // Remove key
- map.size();             // Size

---

## ⭐ Important Pattern (VERY IMPORTANT)
map.put(num, map.getOrDefault(num, 0) + 1);

### 👉 Used for frequency counting

---

## 🧩 Example: Frequency Count
public HashMap<Integer, Integer> frequency(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    return map;
    }

---

## 🧩 Example: Two Sum
public int[] twoSum(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < arr.length; i++) {
        int needed = target - arr[i];
        
        if (map.containsKey(needed)) {
            return new int[] { map.get(needed), i };
        }
        
        map.put(arr[i], i);
    }
    
    return new int[] {};
    }

---
    
## 🎯 Use Cases
- Frequency counting
- Two Sum (value → index)
- First non-repeating element
- Data mapping

---

## ⚡ HashSet vs HashMap
- Feature	HashSet	HashMap
- Stores	Values	Key → Value
- Duplicates	Not allowed	Keys not allowed
- Order	Not guaranteed	Not guaranteed
- Use case	Existence check	Counting / Mapping

---

#🧠 Decision Rule

## 👉 Ask yourself:

- Need existence check? → ✅ HashSet
- Need count / mapping? → ✅ HashMap

---

# 🚀 Key Patterns
## ✅ Pattern 1: Frequency Count
map.put(x, map.getOrDefault(x, 0) + 1);

## ✅ Pattern 2: Seen Before
if (set.contains(x)) {
    // duplicate found
}

## ✅ Pattern 3: Two Sum
int needed = target - current;

---

## 🧩 Practice Problems
### 🟢 Easy
- Contains Duplicate
- Remove Duplicates
- Intersection of Arrays
### 🟡 Medium
- Two Sum
- First Non-Repeating Element
- Majority Element
### 🔴 Advanced
- Longest Consecutive Sequence
- Subarray Sum = 0

---

## 🎯 Final Takeaway
- HashSet → "Have I seen this before?"
- HashMap → "How many / where?"
