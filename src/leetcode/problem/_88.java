/*
88. Merge Sorted Array

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 
Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
 

Follow up: Can you come up with an algorithm that runs in O(m + n) time?
*/

package leetcode.problem;

public class _88 {
    public static void main(String[] args) {
        var nums1 = new int[] { -1,3,0,0,0,0,0 };
        var m = 2;
        var nums2 = new int[] { 0,0,1,2,3 };
        var n = 5;

        Solution.merge(nums1, m, nums2, n);

        for (int i : nums1) {
            System.out.print(i + "-");
        }
    }

    class Solution {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            // Precheck
            if (n == 0)
            {
                return;
            }
            if (m == 0)
            {
                for (int i = 0; i < nums1.length; i++)
                {
                    nums1[i] = nums2[i];
                }
                return;
            }

            // Process
            var nums1Index = m - 1;
            var nums2Index = n - 1;
            var resultIndex = m + n - 1;

            for (int i = resultIndex; i >= 0; i--) {
                
                if (nums1Index < 0)
                {
                    nums1[i] = nums2[nums2Index];
                    nums2Index--;
                    continue;
                }
                if (nums2Index < 0)
                {
                    nums1[i] = nums1[nums1Index];
                    nums1Index--;
                    continue;
                }
                var num1 = nums1[nums1Index];
                var num2 = nums2[nums2Index];
                if (num1 >= num2)
                {
                    nums1[i] = num1;
                    nums1Index--;
                    continue;
                }
                else
                {
                    nums1[i] = num2;
                    nums2Index--;
                    continue;
                }
            }
        }
    }
}