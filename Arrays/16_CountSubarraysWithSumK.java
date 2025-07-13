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
