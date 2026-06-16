import java.util.HashMap;

public class StubstringContainAll3 {
    public static void main(String[] args) {
        String s = "aaacb";
        int n = s.length();
        int count = 0;
        int l = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0); map.put('b', 0); map.put('c', 0);

        for (int r = 0; r < n; r++) {
            // 1. Expand: Add current character
            char current = s.charAt(r);
            map.put(current, map.get(current) + 1);

            // 2. Shrink: WHILE the window is VALID (all counts > 0)
            while (map.get('a') > 0 && map.get('b') > 0 && map.get('c') > 0) {

                // MAGIC FORMULA: If s[l...r] is valid, then everything from
                // s[l...r] to s[l...n-1] is also valid.
                count ++;

                // Now move left to see if the next window is also valid
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
        }
        System.out.println("Final Result: " + count);
    }
}