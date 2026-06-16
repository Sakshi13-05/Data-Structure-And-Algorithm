public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        int totalSum = 0, leftsum = 0, rightsum,i;
        for ( i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        for ( i = 0; i < nums.length ; i++) {

            rightsum = totalSum - leftsum-nums[i];
            if (leftsum == rightsum) {
                System.out.println(i);
                break;
            }
            leftsum += nums[i];
        }
        if(i==nums.length-1){
            System.out.println(-1);
        }

    }
}

