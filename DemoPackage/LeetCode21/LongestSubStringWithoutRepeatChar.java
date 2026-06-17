import java.util.*;

class LongestSubStringWithoutRepeatChar {

    public static int sub(String s) {
        int i = 0, ans = 0;   
     

      HashMap<Character, Integer> m = new HashMap<>();        
        for(int j = 0; j < s.length(); j++){   
            m.put(s.charAt(j), m.getOrDefault(s.charAt(j), 0) + 1);
            // check validity   
            while(m.get(s.charAt(i)) > 1) {
                m.put(s.charAt(i), m.get(s.charAt(i)) - 1);
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abba";
      

     int len = sub(s);
        System.out.println(len);
    }
}