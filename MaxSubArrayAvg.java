public class MaxSubArrayAvg {
    public static void main(String[] args) {
        int [] nums={1,12,-5,-6,50,3};
        int k=4;

        int n= nums.length,sum_curr_window=0,l=0,max_win=Integer.MIN_VALUE;
        int r;

        if(k==0) System.out.println(0);

        if(k==1) {
            for(int i=0;i<nums.length;i++){
                sum_curr_window=Math.max(sum_curr_window,nums[i]);
            }
            System.out.println(sum_curr_window+" is the avg");
        }else{
            for(r=l;r<=k-1;r++) sum_curr_window+=nums[r];
            max_win=sum_curr_window;
            System.out.println(r+" "+sum_curr_window+" "+l);

            while(r<n){
                sum_curr_window+=nums[r]-nums[l];
                max_win=Math.max(max_win,sum_curr_window);
                System.out.println(max_win);

                l++;
                r++;
            }
        }
        System.out.println((float)max_win/k);

    }




}
