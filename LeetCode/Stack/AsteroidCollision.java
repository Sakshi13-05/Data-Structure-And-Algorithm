package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = { 3, 5, -6, 2, -1, 4 };

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < asteroids.length; i++) {

            int current = asteroids[i];
            int current_abs = Math.abs(current);
            boolean survived = true;

            while (!stack.isEmpty() && (stack.peek() > 0 && current < 0)) {

                if (current_abs == stack.peek()) {
                    stack.pop();
                    survived = false;
                    break;

                } else if (current_abs < stack.peek()) {
                    survived = false;
                    break;
                }

                while (!stack.isEmpty() && current_abs > stack.peek()) {
                    stack.pop();

                }

            }

            if (survived) {
                stack.push(current);
            }

        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
