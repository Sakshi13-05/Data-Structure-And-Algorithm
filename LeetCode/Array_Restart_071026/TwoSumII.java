package Array_Restart_071026;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1, curr_sum = 0;
        int[] result = { 0, 0 };
        while (l <= r) {
            curr_sum = nums[l] + nums[r];
            if (curr_sum > target) {
                r--;
            } else if (curr_sum < target) {
                l++;
            } else {
                result[0] = l;
                result[1] = r;
                break;
            }
        }
        return (result);
    }
}

class TwoSumII {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int[] result = s1.twoSum(nums, 9);
        System.out.println(result[0] + "," + result[1]);
    }
}
