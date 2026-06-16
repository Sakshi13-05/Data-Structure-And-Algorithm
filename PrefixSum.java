public class PrefixSum {
    public static void main(String[] args) {
        int []gain={-4,-3,-2,-1,4,3,2};
        int highest_altitude=0,prev=0;

        for(int i=0;i<gain.length;i++){
            prev=prev+gain[i];
            highest_altitude=Math.max(highest_altitude,prev);
        }
        System.out.println(highest_altitude);
    }
}
