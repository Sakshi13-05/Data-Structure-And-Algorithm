import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> sum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0, right = 0, sum = 0;
        for (int fix = 0; fix < nums.length; fix++) {
            left = fix + 1;
            right = nums.length - 1;
            if (fix > 0 && nums[fix] == nums[fix - 1])
                continue;

            while (left < right) {
                // duplicate fix

                sum = nums[fix] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {

                    ans.add(Arrays.asList(nums[fix], nums[right], nums[left]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, -1, 4, 2, 0, -1, 5 };
        List<List<Integer>> ans = sum(nums);
        System.out.println(ans);
    }
}
