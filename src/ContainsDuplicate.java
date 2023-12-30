/*
* Contains Duplicate
* Given an integer array nums,
* return true if any value appears at least twice in the array,
* and return false if every element is distinct.
* https://leetcode.com/problems/contains-duplicate/description/
*
* */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*
     * Intutive and easy solution
     * is to use Set
     * Space: O(n)
     * Time: O(n)
     * */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for (int n : nums) {
            if (visited.contains(n)) return true;
            visited.add(n);
        }
        return false;
    }

    /*
     * Advanced and non-intutive is to use
     * heap logic
     * where as we pass we have the max element at the current position
     * this way we check old elements only if current is less than the prev
     * */
    public boolean containsDuplicate_usingHeap(int[] nums) {
        for (int index = 0; index < nums.length; index++) {
            int current = nums[index];
            int prev = index - 1;
            while (prev >= 0 && current < nums[prev]) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            if (prev >= 0 && current == nums[prev]) {
                nums = null;
                return true;
            }
            nums[prev + 1] = current;
        }
        nums = null;
        return false;
    }
}
