import java.util.Arrays;

class ConstantWindow{
    public int maxOperations(int[] nums, int k) {
//        sorting
        Arrays.sort(nums);

//        pairs
        int count=0,l=0,r= nums.length-1;
        while (l <r) {
            int sum=nums[l]+nums[r];
            if(sum>k) r--;
            if(sum<k) l++;
            if(sum==k) {
                l++;
                r--;
                count++;
            }

        }
        return (count);

    }
}
public class Patterns_Sliding_window {
    public static void main(String[] args) {
        ConstantWindow c1=new ConstantWindow();
        int [] arr={4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int ans=c1.maxOperations(arr,2);
        System.out.println(ans);


    }
}
