/**
 * ✅ Problem: Second Largest Element in an Array (without sorting)
 * 📝 Link: https://www.geeksforgeeks.org/find-second-largest-element-array/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aaditya Kumar
 * 🧠 Approach: Traverse the array once to find the largest, then again for second largest, OR do it in one pass.
 * ⏱️ Time Complexity: O(n)
 * 📦 Space Complexity: O(1)
 */

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        System.out.println("Second Largest Element: " + findSecondLargest(arr));
    }
}
