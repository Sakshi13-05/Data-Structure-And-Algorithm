package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = { 3, -1, 3, 5, 2, 3, 1 };
        int k = 3;
        int[] ans = new int[nums.length - k + 1];
        int index = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollLast();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
            if (i >= k - 1)
                ans[index++] = nums[dq.peekFirst()];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
