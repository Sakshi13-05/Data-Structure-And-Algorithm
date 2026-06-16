class Cards{
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=k-1;
        double maxAvg=0.0d,avg=0.0d,sum=0.0d;
        if(nums.length-1 <=1) maxAvg=(double)nums[0]/4;
        else
        {
            for (int i = l; i <= r; i++) {
                sum += nums[i];
            }
            maxAvg = sum / 4;

            while (r < nums.length - 1) {
                sum -= nums[l];
                l++;
                r++;
                sum += nums[r];


                avg = sum / 4;

                if (maxAvg <= avg) {
                    maxAvg = avg;
                }

            }

        }
        return (maxAvg);
    }
}
public class Max_points {
    public static void main(String[] args) {
        Cards c1=new Cards();
        int [] arr={1,12,-5,-6,50,3};
        double ans=c1.findMaxAverage(arr,4);
        System.out.println(ans);

    }
}
