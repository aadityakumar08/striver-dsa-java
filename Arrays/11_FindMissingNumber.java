/**
 * ✅ Problem: Find the Missing Number in the Array
 * 📝 Link: https://leetcode.com/problems/missing-number/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Use sum of first n natural numbers: n*(n+1)/2.
 *     Subtract the actual sum from expected sum to get the missing number.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class FindMissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exsum = (n * (n + 1)) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        return exsum - sum;
    }

    public static void main(String[] args) {
        FindMissingNumber obj = new FindMissingNumber();
        int[] nums = {3, 0, 1}; // Missing number = 2
        int result = obj.missingNumber(nums);
        System.out.println("Missing number is: " + result);
    }
}
