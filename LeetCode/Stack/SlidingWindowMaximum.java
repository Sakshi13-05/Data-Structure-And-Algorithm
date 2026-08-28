package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * SlidingWindowMaximum
 */
public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = { 3, -1, 2, 6, 5, 4 };
        int k = 3, j = 0;
        int[] ans = new int[nums.length - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // remove expiry
            while (!dq.isEmpty() && dq.getFirst() < i - k + 1) {
                dq.pollFirst();
            }
            // remove useless
            while (!dq.isEmpty() && nums[dq.getLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);

            if (i >= k - 1) {
                ans[j++] = nums[dq.getFirst()];
            }
        }
        for (int x : ans) {
            System.out.println(x);
        }
    }
}