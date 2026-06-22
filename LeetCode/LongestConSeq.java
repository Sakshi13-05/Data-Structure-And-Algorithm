import java.util.*;

public class LongestConSeq {
    public static int longestConsecutive(int[] nums) {
        int count = 0, maxlength = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                // start of seq
                count = 1;
                int j = 1;
                while (set.contains(nums[i] + j++)) {
                    count++;

                }
                maxlength = Math.max(maxlength, count);
            }

        }
        return maxlength;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 6, 5, 4, 100, 3, 200, 2, 3 };
        int count = longestConsecutive(nums);
        System.out.println(count);
    }
}