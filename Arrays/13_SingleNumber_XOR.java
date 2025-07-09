/**
 * ✅ Problem: Find the Number that Appears Once, All Others Twice
 * 📝 Link: https://leetcode.com/problems/single-number/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: XOR all elements. Pairs cancel out (a ^ a = 0), leaving the unique number.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class SingleNumber_XOR {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        SingleNumber_XOR obj = new SingleNumber_XOR();
        int[] nums = {4, 1, 2, 1, 2};
        int result = obj.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
