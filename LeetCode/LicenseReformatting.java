import java.util.*;;

public class LicenseReformatting {
    public static String licenseKeyFormatting(String s, int k) {
        String S = "";
        int i = 0;
        while (s.charAt(i) != '-') {
            S = S + s.charAt(i);
            i++;
        }
        S = S + "-";
        int counter = 0;
        while (i < s.length()) {
            if (s.charAt(i) != '-') {
                S = S + s.charAt(i);
                counter++;
                if (counter == k) {
                    counter = 0;
                    S = S + "-";
                }
            }
            i++;

        }

        System.out.println(S);
        return S;
    }

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String ans = licenseKeyFormatting(s, k);
        System.out.println(ans);
    }
}
