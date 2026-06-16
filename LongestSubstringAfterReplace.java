import com.sun.jdi.Value;

import java.util.HashMap;

public class LongestSubstringAfterReplace {
    public static void main(String[] args) {
        String s="ABABABA";
        int k=2;

        int maxFreq=0,maxChangeCanDo=0,left=0,maxLen=0;

        HashMap<Character, Integer>map=new HashMap<>();

        for(int right=0;right<s.length();right++){
            char current=s.charAt(right);
            map.put(current,map.getOrDefault(current,0)+1);

            maxFreq=Math.max(maxFreq,map.get(current));

            maxChangeCanDo=(right-left+1)-maxFreq;

            if(maxChangeCanDo<=k){
                maxLen=Math.max(maxLen,(right-left+1));

            }else{
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }
        }
        System.out.println(maxLen);
    }
}
