/**
 * ✅ Problem: Find the Union of Two Sorted Arrays
 * 📝 Link: https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
 * 📅 Date: 2025-06-23
 * 👨‍💻 Author: Aditya Kumar
 * 🧠 Approach: Two-pointer technique for sorted arrays with duplicate skip check.
 * ⏱️ Time Complexity: O(n + m)
 * 📦 Space Complexity: O(n + m)
 */

import java.util.*;

public class UnionOfTwoSortedArrays {
    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }

        while (i < n) {
            if (union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> union = findUnion(arr1, arr2, arr1.length, arr2.length);

        System.out.println("Union of arr1 and arr2 is:");
        for (int val : union) {
            System.out.print(val + " ");
        }
    }
}
