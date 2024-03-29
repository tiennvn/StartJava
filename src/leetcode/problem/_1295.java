/*
1295. Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 10^5
*/

/*
Approach:
- 10^5 = 100.000
- Check number in range:
    + 10 - 99
    + 1000 - 9999
    + 100000
*/

package leetcode.problem;

public class _1295 {
    public static void main(String[] args) {
        // Input
        var nums = new int[] { 1, 21, 35, 6 };

        var result = Solution.findNumbers(nums);
        System.out.println("result = " + result);
    }

    class Solution {
        public static int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (isEvenDigitNumber(num)) {
                    count++;
                }
            }
            return count;
        }

        public static boolean isEvenDigitNumber(int num) {
            if ((num >= 10 && num <= 99)) {
                return true;
            } else if (num >= 1000 && num <= 9999) {
                return true;
            } else if (num == 100000) {
                return true;
            }
            return false;
        }
    }

}
