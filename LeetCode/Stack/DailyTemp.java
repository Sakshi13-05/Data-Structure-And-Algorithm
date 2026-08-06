package Stack;

import java.util.ArrayDeque;

public class DailyTemp {
    public static void daily(int[] temp) {
        int n = temp.length;
        int[] answer = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            int current = temp[i];
            while (!stack.isEmpty() && current >= temp[stack.peek()])
                stack.pop();
            if (stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
    }

    public static void main(String[] args) {
        int[] temp = { 71, 54, 87, 90, 34, 23 };
        daily(temp);
    }
}
