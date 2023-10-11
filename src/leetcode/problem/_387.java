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
            int result = -1;
            int maxIndex = s.length() - 1;
            Set<Character> setCharacters = new HashSet<Character>();
            for (int i = 0; i <= maxIndex; i++) {
                char currentChar = s.charAt(i);
                if (setCharacters.contains(currentChar))
                {
                    continue;
                }
                
                for (int j = maxIndex; j >= i; j--) {
                    if (currentChar == s.charAt(j))
                    {
                        if (j == i)
                        {
                            return i;
                        }
                        setCharacters.add(currentChar);
                        break;
                    }
                }
            }
            return result;
        }
    }
}
