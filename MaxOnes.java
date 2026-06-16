public class MaxOnes {
    public static void main(String[] args) {
        int [] nums={1,1,1,1,0,1,1,0,0,0};
        int k=2;
        int count=0,max_win=0,j=0;

        for(int i=0;i< nums.length;i++){
            if(nums[i]==0) count++;
            if(count>k) {

                while(nums[j]!=0) j++;
                j++;
                count--;
            }
            max_win=Math.max(max_win,i-j+1);
        }


        System.out.println(max_win);
    }




}
