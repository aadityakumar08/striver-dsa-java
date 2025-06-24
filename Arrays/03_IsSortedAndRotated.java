/**
 * ✅ Problem: Check if the Array is Sorted and Rotated
 * 📝 Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Count how many times the array breaks ascending order.
 *     If count > 1, it's not sorted and rotated.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class IsSortedAndRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println("Is sorted and rotated? " + new IsSortedAndRotated().check(arr));
    }
}
