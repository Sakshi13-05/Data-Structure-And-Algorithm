import java.util.HashMap;

public class MajorityElement{
    public static void main(String[] args) {
        int []nums={8,8,7,7,7};
        int largest=0,ele=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(largest<map.get(nums[i])){
                largest= map.get(nums[i]);
                ele=nums[i];
            }
        }
        System.out.println(map);
        System.out.println(ele);
    }
}