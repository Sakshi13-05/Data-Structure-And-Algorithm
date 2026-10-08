package Array_Restart_071026;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionOfThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        // skeleton of 3sum
        Arrays.sort(nums);
        for (int fixed = 0; fixed < nums.length; fixed++) {
            // duplicate of f
            if (fixed > 0 && nums[fixed] == nums[fixed - 1]) {
                continue;
            }
            int left = fixed + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[fixed];

                if (sum < 0) {
                    left++;

                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[left]);
                    list1.add(nums[right]);
                    list1.add(nums[fixed]);

                    result.add(list1);

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;

                }
            }
        }

        return (result);

    }
}

public class ThreeSum {
    public static void main(String[] args) {
        SolutionOfThreeSum s1 = new SolutionOfThreeSum();
        int[] nums = { 0, 1, -1, 0, 2, 3, 5, 6 };
        List<List<Integer>> result = new ArrayList<>();
        result = s1.threeSum(nums);
        System.out.println(result);
    }
}
