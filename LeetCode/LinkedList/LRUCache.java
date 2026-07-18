package LinkedList;

import java.util.*;

class Node {
    int key, value;
    Node prev, next;

    Node(int key, int val) {
        this.value = val;
        this.key = key;
    }
}

public class LRUCache {

    private int capacity;
    private HashMap<Integer, Node> map;

    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1); // Dummy head
        tail = new Node(-1, -1); // Dummy tail

        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        node.prev = tail.prev;
        tail.prev.next = node;

        tail.prev = node;
        node.next = tail;

    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }

        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insert(node);
        } else {
            Node node = new Node(key, value);
            insert(node);
            map.put(key, node);
            if (map.size() > capacity) {
                Node lru = head.next;
                remove(lru);
                map.remove(lru.key);
            }
        }
    }
}
