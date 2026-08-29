package Stack;

import java.util.ArrayDeque;

public class NextGreaterElemetIIRev {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int n = nums.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[n];

        // fill array
        for (int i = 2 * n - 1; i >= n; i--) {
            int actual_index = i % n;
            while (!stack.isEmpty() && stack.peek() <= nums[actual_index]) {
                stack.pop();
            }
            stack.push(nums[actual_index]);

        }

        for (int i = 0; i <= n - 1; i++) {

            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(nums[i]);

        }
        for (int x : ans) {
            System.out.print(x);
        }
    }
}
