/**
 * ✅ Problem: Longest Subarray with Given Sum K (Positive Numbers Only)
 * 📝 Link: https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Sliding window – expand window, shrink when sum exceeds K.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class LongestSubarraySumK_Positive {
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        int left = 0, right = 0, sum = 0, maxLen = 0;

        while (right < nums.length) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1};
        int k = 5;

        int result = longestSubarrayWithSumK(nums, k);
        System.out.println("Longest subarray length with sum " + k + ": " + result);
    }
}

// Add solution for Longest Subarray with Sum K using Sliding Window
import java.util.*;

public class Main {
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}

