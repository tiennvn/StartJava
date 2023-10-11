package leetcode.problem;

public class _1662 {
    public static void main(String[] args) {
        String[] word1 = new String[] { "ab", "cvb" };
        String[] word2 = new String[] { "abc", "vb" };

        var result = Solution.arrayStringsAreEqual(word1, word2);
        System.out.println("result: " + result);
    }

    class Solution {
        public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            for (String s : word1) {
                s1.append(s);
            }

            for (String s : word2) {
                s2.append(s);
            }

            return s1.toString().equals(s2.toString());
        }
    }
}
