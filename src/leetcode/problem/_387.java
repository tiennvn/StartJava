/*
387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.

 */

package leetcode.problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _387 {
    public static void main(String[] args) {
        String input = "lgeetcolde";
        int result = Solution.firstUniqChar(input);
        System.out.println("result: " + result);
    }

    class Solution {
        public static int firstUniqChar(String s) {
            int ans = -1;
            for (char c = 'a'; c <= 'z'; c++) {
                int index = s.indexOf(c);
                if (index != -1 && index == s.lastIndexOf(c)) {
                    ans = Math.min(ans, index);
                }
            }

            return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
}
