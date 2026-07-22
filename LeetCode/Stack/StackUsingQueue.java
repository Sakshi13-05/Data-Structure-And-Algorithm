package Stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> que = new ArrayDeque<>();

    public StackUsingQueue() {

    }

    public static void push(int x) {
        que.offer(x);
        for (int i = 1; i <= que.size() - 1; i++) {
            int ele_removed = que.poll();
            que.offer(ele_removed);
        }
    }

    public static int pop() {
        return (que.poll());
    }

    public static int peek() {
        return (que.peek());
    }

    public static boolean empty() {
        return (que.isEmpty());
    }

    public static void main(String[] args) {

        que.offer(10);
        que.offer(20);
        que.offer(30);

        push(40);
        System.out.println("ini que " + que);
        System.out.println("_______________");
        System.out.println("after removing from top " + pop());
        System.out.println("_______________");
        System.out.println("peep top " + peek());
        System.out.println("_____________");
        System.out.println("stack size " + empty());
    }

}
