public class StringCompression {
    public static void main(String[] args) {
        String chars[]={"a","a","b","b","c","c","c"};
        String s = "";
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            // Check if next char is same
            if (i + 1 < chars.length && chars[i] == chars[i+1]) {
                count++;
            } else {
                s += chars[i];
                if (count > 1) {
                    s += count;
                }
                count = 1; // Reset for next group
            }
        }


        System.out.println(s);
    }
}
