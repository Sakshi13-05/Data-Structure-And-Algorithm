public class Leetcode1456 {
    static boolean isVowel(char x){
        if("aeiouAEIOU".indexOf(x)==-1) return false;
        else return true;
    }
    public static void main(String[] args) {
        String s="aeiou";
        int k=2;
        int count=0,l=0,max_count=0;

        for(int r=0;r<s.length();r++){
            if(isVowel(s.charAt(r))) count++;

            while((r-l+1)>k){
                if(isVowel(s.charAt(l))) count--;
                l++;
            }

            max_count=Math.max(max_count,count);
        }
        System.out.println(max_count);
    }
}
