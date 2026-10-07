package Array_Restart_071026;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = { 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            c = target - nums[i];
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
                break;
            }
            map.put(c, i);
        }
        return (result);
    }
}

class TwoSum {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = { 3, 3 };
        int[] result = s1.twoSum(nums, 6);
        System.out.println(result[0] + "," + result[1]);
    }
}