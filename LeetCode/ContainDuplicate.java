import java.util.*;

public class ContainDuplicate {
    public static boolean find(int[] nums) {
        boolean ans = false;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                ans = true;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        boolean ans = find(nums);
        System.out.println(ans);
    }
}
