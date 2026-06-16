import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";


        int left=0;

        List<Integer> list=new ArrayList<>();

        HashMap<Character,Integer> pMap=new HashMap<>();
        HashMap<Character,Integer> aMap=new HashMap<>();

//        creating frequency map for the p
        for(int i=0;i<p.length();i++){
            pMap.put(p.charAt(i),pMap.getOrDefault(p.charAt(i),0)+1);
        }
//        System.out.println(pMap);
//        System.out.println("--------------");

        for(int right=0;right<s.length();right++){
            char current=s.charAt(right);
            aMap.put(current,aMap.getOrDefault(current,0)+1);
//            System.out.println(aMap);
//            System.out.println("-------------");

            if(right-left+1>=p.length()){

                if(pMap.equals(aMap)){
                    list.add(left);
//                    System.out.println("this is"+list);
//                    System.out.println("===============");
                }

                char leftChar=s.charAt(left);
//                System.out.println(left +" "+ leftChar);
//                System.out.println("-------------");

                int index=aMap.get(leftChar)-1;
                aMap.put(leftChar,index);
                left++;
//                System.out.println(index);

                if(index==0){
                    aMap.remove(leftChar);
//                    System.out.println("--------------");
                }

            }
        }
//        System.out.println(list);

    }
}
