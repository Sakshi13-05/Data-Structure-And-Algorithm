import java.util.*;

public class ProductOfArrayExceptSelf {
    static public void productExceptSelf(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int leftPdt = 1, rightPdt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0)
                leftPdt = leftPdt * nums[i - 1];
            ans.add(leftPdt);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i != nums.length - 1)
                rightPdt = rightPdt * nums[i + 1];
            ans.add(i, rightPdt * ans.get(i));
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        productExceptSelf(nums);

    }
}
