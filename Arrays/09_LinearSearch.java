/**
 * ✅ Problem: Linear Search in an Array
 * 📝 Link: https://www.geeksforgeeks.org/linear-search/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Traverse the array and return the index when the target element is found.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int target = 4;

        int index = search(arr, target);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found in the array.");
    }
}
