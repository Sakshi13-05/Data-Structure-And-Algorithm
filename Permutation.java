import java.util.HashMap;

public class Permutation {
    public static void main(String[] args) {
        String s2="dcda";
        String s1="adc";

        int n=s1.length();
        int i=0,l=0,r=n-1;

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();

        for(int j=0;j<s1.length();j++) map1.put(s1.charAt(j),map1.getOrDefault(s1.charAt(j),0)+1);
 System.out.println(map1);

        while(i<s2.length()){
            System.out.println("iteration"+i);
            char current= s2.charAt(i);
            map2.put(current,map2.getOrDefault(current,0)+1);
            System.out.println(map2);

            if(i==r){
                if(map2.equals(map1)) {
                    System.out.println(true);
                    break;
                }
                else{
                    char left=s2.charAt(l);
                    map2.put(left,map2.getOrDefault(left,0)-1);
                    if(map2.get(left)==0) map2.remove(left);
                    l++;
                    r++;
                    System.out.println(map2+"in the if");
                }
            }
            i++;
        }
        System.out.println(false);
    }
}
