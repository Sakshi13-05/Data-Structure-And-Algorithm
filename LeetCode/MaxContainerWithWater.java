public class MaxContainerWithWater {
    public static int contain(int[] nums) {
        int max = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] < nums[j]) {
                max = Math.max(max, nums[i] * (j - i));
                // System.out.println(nums[i] * (j - i));
                i++;

            } else {
                max = Math.max(max, nums[j] * (j - i));
                // System.out.println(nums[j] * (j - i));
                j--;

            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] heights = { 7, 0, 1, 2, 5, 8, 6 };
        int max = contain(heights);
        System.out.println(max);
    }
}
