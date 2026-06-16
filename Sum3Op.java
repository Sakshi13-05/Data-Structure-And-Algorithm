import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Sum3Op {
    public static void main(String[] args) {
        int []nums={-1,-1,0,1,2,4};
        int i,j,k;
        int sum;
        ArrayList<Integer>list;
        ArrayList<ArrayList<Integer>>set=new ArrayList<>();

        Arrays.sort(nums);
        for(i=0;i< nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            j=i+1;
            k= nums.length-1;
            while(j<k){
               sum=nums[i]+nums[j]+nums[k];
                System.out.println(sum+"-----sum");
                if(sum>0) k--;
                else if(sum<0) j++;
                else {
                    list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(new ArrayList<>(list));
                    list.clear();
                    j++;
                    k--;
                    while(j<k && nums[j-1]==nums[j]) j++;
                    while (j<k&&nums[k]==nums[k+1])k++;
                }
            }
        }
        System.out.println(set);
    }
}
