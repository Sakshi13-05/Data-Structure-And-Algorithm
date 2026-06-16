import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Sum3 {
    public static void main(String[] args) {
        int []nums={-1,0,1,2,-1,4};
        HashSet<Integer> set;
        HashSet<ArrayList<Integer>> answer=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            set=new HashSet<>();
//            everytime it has to be initilze
            for(int j=i+1;j< nums.length;j++){
                int temp=-(nums[i]+nums[j]);
                if(!set.contains(temp)){
                    set.add(nums[j]);
                }else{
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(temp);
                    Collections.sort(list);
                    System.out.println(list);
                    answer.add(new ArrayList<>(list));
                    list.clear();

                }
            }
        }
        System.out.println(answer);
    }
}
