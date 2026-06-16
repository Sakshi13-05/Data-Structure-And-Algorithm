public class Removeduplicates {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        int unique=1,l=0,r= l+1;

        while(r<=nums.length-1 && l<r){
            if(nums[l]==nums[r]){
                r++;
            }else{
                unique++;
                l++;

                nums[l]=nums[r];
                r++;

            }
        }
        System.out.println(unique);

    }
}
