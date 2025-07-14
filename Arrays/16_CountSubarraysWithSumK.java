/**
 * ✅ Problem: Count Subarrays with Sum K (Positives and Negatives Allowed)
 * 📝 Link: https://leetcode.com/problems/subarray-sum-equals-k/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Prefix Sum + HashMap to count frequency of prefix sums.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(n)
 */

import java.util.*;

public class CountSubarraysWithSumK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Important base case!

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -1, 1, 1, 1};
        int k = 3;
        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}


// adding another method

import java.util.*;

public class tUf {
    public static int getLongestSubarray(int []a, int k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            int s = 0;
            for (int j = i; j < n; j++) { // ending index
                // add the current element to
                // the subarray a[i...j-1]:
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}

