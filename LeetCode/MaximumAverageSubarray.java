import java.util.*;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {

        if (k > nums.length)
            return 0.0;

        double sum = 0.0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];

        }
        double maxAvg = sum;

        int i = 0, j = k - 1;
        while (j < nums.length - 1) {
            sum -= nums[i];
            i++;
            j++;
            sum += nums[j];
            maxAvg = Math.max(maxAvg, sum);
        }
        return maxAvg / k;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        double ans = findMaxAverage(nums, 4);
        System.out.println(ans);
    }
}
