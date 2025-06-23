/**
 * ✅ Problem: Largest Element in an Array
 * 📝 Link: https://www.geeksforgeeks.org/find-largest-element-array/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Traverse the array once and track the max value.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class LargestElement {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        System.out.println("Largest Element: " + findLargest(arr));
    }
}
