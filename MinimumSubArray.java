public class MinimumSubArray {
    public static void main(String[] args) {
        int []nums={2,3,1,2,4,3};
        int target=7;

        int l=0,min_size=Integer.MAX_VALUE,sum=0;

        for(int r=0;r< nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                min_size=Math.min(min_size,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(min_size==Integer.MAX_VALUE) System.out.println("0");
        else System.out.println(min_size);
    }
}
