public class MaxOneByDelete {
    public static void main(String[] args) {
        int []nums={0,1,1,1,0,1,1,0,1};
        int l=0,r=0,zeroCount=0,maxlen=0;

        while(r!= nums.length){
            if(nums[r]==0) zeroCount++;

            while(zeroCount>1){
                if(nums[l]==0){
                    zeroCount--;
                }
                l++;
            }

            maxlen=Math.max(maxlen,r-l);

            r++;
        }
        System.out.println(maxlen);
    }
}
