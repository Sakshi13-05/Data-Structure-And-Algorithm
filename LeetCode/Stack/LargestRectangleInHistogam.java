package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogam {
    public static int get(int[] heights) {
        int ans = 0, max_ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] NSL = new int[heights.length];
        int[] NSR = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() && (heights[stack.peek()] >= heights[i])) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                NSL[i] = -1;
            } else {
                NSL[i] = stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i < heights.length; i++) {
            System.out.print(NSL[i]);
        }
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println();
        for (int i = heights.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && (heights[stack.peek()] >= heights[i])) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                NSR[i] = heights.length;
            } else {
                NSR[i] = stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i < heights.length; i++) {
            System.out.print(NSR[i]);
        }
        System.out.println();
        for (int i = 0; i < heights.length; i++) {
            int width = NSR[i] - NSL[i] - 1;
            ans = heights[i] * width;
            max_ans = max_ans > ans ? max_ans : ans;
        }
        return max_ans;
    }

    public static void main(String[] args) {
        int[] heights = { 1, 1 };
        int ans = get(heights);
        System.out.println(ans);
    }

}
