package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class NextGreaterElementll {
    public static void next(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        for (int i = 2 * n - 1; i >= n; i--) {
            int realIndex = i % n;
            int current = arr[realIndex];
            while (!stack.isEmpty() && current >= stack.peek()) {
                stack.pop();
            }
            stack.push(current);
        }

        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];

            while (!stack.isEmpty() && current >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
                // System.out.println("index is" + i + "next grt ele is" + ans[i]);
            } else {
                ans[i] = stack.peek();
                // System.out.println("index is" + i + "next grt ele is" + ans[i]);
            }
            stack.push(current);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 4, 3 };
        next(arr);
    }
}
