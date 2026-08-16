package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Custom Generic Queue Implementation (Linked List based)
 * Ready to use directly in problem-solving.
 * 
 * Supports all basic Queue operations:
 * - Creation: new CustomQueue<T>()
 * - Add / Enqueue: q.enqueue(val) or q.add(val)
 * - Remove / Dequeue: q.dequeue() or q.poll()
 * - Peek / Front: q.peek()
 * - Check Empty: q.isEmpty()
 * - Size: q.size()
 * - Print: q.printQueue()
 */
public class CustomQueue<T> {

    // Internal Node structure
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    // 1. Creation / Initialization
    public CustomQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // 2. Add Element (Enqueue / Offer) - O(1)
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Alias for enqueue
    public void add(T item) {
        enqueue(item);
    }

    // 3. Remove Element (Dequeue / Poll) - O(1)
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! Cannot dequeue.");
            return null;
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    // Alias for dequeue
    public T poll() {
        return dequeue();
    }

    // 4. Peek Front Element without removing - O(1)
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        return front.data;
    }

    // 5. Check if Queue is empty - O(1)
    public boolean isEmpty() {
        return size == 0;
    }

    // 6. Get size of Queue - O(1)
    public int size() {
        return size;
    }

    // 7. Print Queue contents - O(N)
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue: []");
            return;
        }
        StringBuilder sb = new StringBuilder("Queue (Front -> Rear): [");
        Node<T> temp = front;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append(", ");
            }
            temp = temp.next;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Node<T> temp = front;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(", ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // Main method testing custom queue & showing standard Java Queue snippet
    public static void main(String[] args) {
        System.out.println("=== 1. DEMO: Custom Generic Queue ===");
        CustomQueue<Integer> q = new CustomQueue<>();

        // Check if empty
        System.out.println("Is Queue Empty? " + q.isEmpty());

        // Enqueue elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.printQueue(); // Queue (Front -> Rear): [10, 20, 30]
        System.out.println("Size: " + q.size()); // 3

        // Peek
        System.out.println("Peek Front Element: " + q.peek()); // 10

        // Dequeue
        System.out.println("Dequeued Element: " + q.dequeue()); // 10
        q.printQueue(); // Queue (Front -> Rear): [20, 30]
        System.out.println("Size: " + q.size()); // 2

        // Emptying queue
        q.dequeue();
        q.dequeue();
        q.printQueue(); // Queue: []
        System.out.println("Is Queue Empty? " + q.isEmpty());

        System.out.println("\n=== 2. QUICK LEETCODE SNIPPET (Standard Java Queue) ===");
        // Fast ready-to-copy standard snippet for LeetCode problem solving:
        Queue<Integer> stdQueue = new ArrayDeque<>();
        stdQueue.offer(100); // add
        stdQueue.offer(200);
        System.out.println("Standard ArrayDeque Queue: " + stdQueue);
        System.out.println("Peek: " + stdQueue.peek());
        System.out.println("Poll (Remove): " + stdQueue.poll());
        System.out.println("Size: " + stdQueue.size());
        System.out.println("IsEmpty: " + stdQueue.isEmpty());
    }
}
