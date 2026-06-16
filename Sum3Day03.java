import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3Day03 {
    public static void main(String[] args) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> triplets=new ArrayList<>();
        int []nums={4,-1,-1,0,1,2};
        Arrays.sort(nums);

        for(int h=0;h< nums.length;h++) {
            int i=h+1,j= nums.length-1;
            while (i < j) {
                if (nums[i] + nums[j] < nums[h]) {
                    i++;
                } else if (nums[i] + nums[j] > nums[h]) {
                    j--;
                } else {
                    triplets.add(nums[h]);
                    triplets.add(nums[i]);
                    triplets.add(nums[j]);
                    i++;
                    j--;
                    result.add(triplets);
                }
            }
        }
        System.out.println(result);
    }
}
