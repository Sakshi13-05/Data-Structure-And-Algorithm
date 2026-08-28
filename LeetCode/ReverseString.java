public class ReverseString {
    public static void main(String[] args) {
        String[] s = { "h", "e", "l", "o" };
        int i = 0, j = s.length - 1;
        while (i < j) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        for (i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
