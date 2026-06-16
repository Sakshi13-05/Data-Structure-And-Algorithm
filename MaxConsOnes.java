public class MaxConsOnes {
    public static void main(String[] args) {
        int [] nums={1,1,1,0,0,0,1,1,1,1,0};
        int left=0,right=0,k=2,maxlen=0;
        int copy=0;

        while(right!= nums.length-1) {
            if(nums[right]==0) copy++;

            while(copy>k){
                if(nums[left]==0) copy--;
                left++;
            }

            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        System.out.println(maxlen);

    }
}
