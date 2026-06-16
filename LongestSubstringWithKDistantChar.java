import java.util.HashMap;

public class LongestSubstringWithKDistantChar {
    public static void main(String[] args) {
        String s="eceba";
        int k=2;

        if(k==0) System.out.println("0");

        else if (k>s.length()) {
            System.out.println(s.length());
        }else{
            int l=0,max_len=0;
            HashMap<Character,Integer> map=new HashMap<>();

            for(int r=0;r<s.length();r++){
                char current=s.charAt(r);
                map.put(current,map.getOrDefault(current,0)+1);

                while (map.size()>k){
                    char left=s.charAt(l);
                    map.put(left,map.get(left)-1);
                    if(map.get(left)==0) map.remove(left);
                    l++;
                }
                max_len=Math.max(max_len,r-l+1);
            }
            System.out.println(max_len);
        }
    }
}
