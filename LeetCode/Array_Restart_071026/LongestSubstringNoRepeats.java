package Array_Restart_071026;

import java.util.HashSet;

class SolutionOfLongestSubstringNoRepeats {
    public int lengthOfLongestSubstring(String s) {
        int max_count = 0, left = 0, right = 0;
        if (s.isEmpty())
            return (0);

        HashSet<Character> set = new HashSet<>();

        while (right != s.length() && left <= right) {
            if (set.add(s.charAt(right))) {
                max_count = max_count > set.size() ? max_count : set.size();
                right++;
            } else {
                while (left != right) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
        }
        return max_count;
    }
}

public class LongestSubstringNoRepeats {
    public static void main(String[] args) {
        SolutionOfLongestSubstringNoRepeats s4 = new SolutionOfLongestSubstringNoRepeats();
        String s = "abcdef";
        int max = s4.lengthOfLongestSubstring(s);
        System.out.println(max);
    }
}
