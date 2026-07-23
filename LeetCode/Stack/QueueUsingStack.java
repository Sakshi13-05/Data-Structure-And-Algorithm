package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingStack {
    static Deque<Integer> stack1 = new ArrayDeque<>();
    static Deque<Integer> stack2 = new ArrayDeque<>();

    public static void push(int x) {
        stack1.push(x);

    }

    public static int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return (stack2.pop());
    }

    public static int peep() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return (stack2.peek());
    }

    public static boolean empty() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return (true);
        }
        return false;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        System.out.println("stack1 " + stack1);
        System.out.println("stack2 " + stack2);
        System.out.println("_____________");
        int x = pop();
        System.out.println(x);
        System.out.println("stack1 " + stack1);
        System.out.println("stack2 " + stack2);
        System.out.println("_____________");
        int y = peep();
        System.out.println(y);
        System.out.println("stack1 " + stack1);
        System.out.println("stack2 " + stack2);
        System.out.println("_____________");
        System.out.println(empty());

    }
}
