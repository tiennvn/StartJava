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
            Set<Character> setCharacters = new HashSet<Character>();
            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                if (setCharacters.contains(currentChar))
                {
                    continue;
                }
                
                if (s.lastIndexOf(currentChar) == i)
                {
                    return i;
                }
                setCharacters.add(currentChar);
            }
            return -1;
        }
    }
}
