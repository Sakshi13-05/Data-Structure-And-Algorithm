import java.util.Arrays;

public class MinSizeSubArray {
    public static void main(String[] args) {
        int []nums={2,3,1,2,4,3};

        int target=7;
        int sum=0,min_size=Integer.MAX_VALUE,size=0;

        int left=0;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            while(sum>=target){
                size=right-left+1;
                sum-=nums[left];
                left++;
                if(size<min_size) {
                    min_size=size;
                }
            }

        }


    }
}
