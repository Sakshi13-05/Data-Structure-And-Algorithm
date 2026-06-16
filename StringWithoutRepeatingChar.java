import java.util.HashMap;

public class StringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s="tmmzuxt" ;

        int maxlen=0,left=0,right=0;
        HashMap<Character,Integer> map=new HashMap<>();

        for(right=0;right<s.length();right++){
            char current=s.charAt(right);

            if(map.containsKey(current)){
                left=Math.max(left,map.get(current)+1);
            }else{
               map.put(current,right);
                maxlen=Math.max(maxlen,right-left+1);

            }


        }
        if(maxlen==0) System.out.println("0");
        else System.out.println(maxlen);


    }
}
