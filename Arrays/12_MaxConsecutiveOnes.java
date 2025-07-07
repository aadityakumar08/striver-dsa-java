/**
 * ✅ Problem: Maximum Consecutive 1s in a Binary Array
 * 📝 Link: https://leetcode.com/problems/max-consecutive-ones/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Count 1s in a row, reset on 0, and track max count.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currCount++;
            } else {
                maxCount = Math.max(maxCount, currCount);
                currCount = 0;
            }
        }

        maxCount = Math.max(maxCount, currCount);
        return maxCount;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = obj.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);
    }
}
