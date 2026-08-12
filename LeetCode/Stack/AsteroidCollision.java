package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = { 10, 2, -5 };

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < asteroids.length; i++) {

            int current = asteroids[i];

            if (!stack.isEmpty() && (stack.peek() > 0 && current < 0)) {
                int current_abs = Math.abs(current);

                if (current_abs == stack.peek()) {
                    stack.pop();
                    continue;

                } else if (current_abs < stack.peek()) {
                    continue;
                }

                while (!stack.isEmpty() && current_abs > stack.peek()) {
                    stack.pop();
                }

            }
            stack.push(current);

        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());

        }
    }
}
