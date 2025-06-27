/**
 * ✅ Problem: Move All Zeroes to End of Array
 * 📝 Link: https://leetcode.com/problems/move-zeroes/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Two-pointer method with in-place swapping.
 *     Move non-zero elements forward and swap with current position.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class MoveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroesToEnd obj = new MoveZeroesToEnd();
        int[] nums = {0, 1, 0, 3, 12};

        obj.moveZeroes(nums);

        System.out.print("Array after moving zeroes to end: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
