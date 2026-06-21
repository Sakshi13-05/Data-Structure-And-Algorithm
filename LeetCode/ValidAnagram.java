import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = 0;
        }

        for (int i = 0; i < t.length(); i++) {
            int index = s.charAt(i) - 97;
            freq[index]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 97;
            freq[index]--;

        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean ans = isAnagram("rat", "car");
        System.out.println(ans);
    }
}
