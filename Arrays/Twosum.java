import java.util.HashMap;

/*
 * Problem: Two Sum
 *
 * Approach:
 * Use a HashMap to store each number and its index.
 * For every element, calculate the complement:
 * complement = target - current number.
 *
 * If the complement already exists in the HashMap,
 * we have found the two numbers whose sum equals the target.
 * Otherwise, store the current number and its index.
 *
 * Time Complexity: O(n)
 * We traverse the array only once.
 *
 * Space Complexity: O(n)
 * In the worst case, the HashMap stores all elements.
 */

class Solution {

    public int[] twoSum(int[] nums, int target) {

        // HashMap stores the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate the number needed to reach the target
            int complement = target - nums[i];

            // Check if the complement is already present
            if (map.containsKey(complement)) {

                // Return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[] {};
    }
}