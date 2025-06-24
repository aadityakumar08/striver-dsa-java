/**
 * ✅ Problem: Remove Duplicates from Sorted Array
 * 📝 Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Two-pointer technique to overwrite duplicates.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int length = new RemoveDuplicatesSortedArray().removeDuplicates(nums);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
