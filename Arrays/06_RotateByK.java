/**
 * ✅ Problem: Rotate an Array by K Places (Right Rotation)
 * 📝 Link: https://leetcode.com/problems/rotate-array/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aaditya Kumar
 * 🧠 Approach: Use reverse algorithm in 3 steps:
 *     1. Reverse entire array
 *     2. Reverse first K elements
 *     3. Reverse the rest
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class RotateByK_Right {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateByK_Right obj = new RotateByK_Right();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.rotate(arr, k);

        System.out.print("Array after right rotation by " + k + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
