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
