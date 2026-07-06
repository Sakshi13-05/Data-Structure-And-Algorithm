package LinkedList;

public class LLini {
    public int val;
    public LLini next;

    public LLini() {
    }

    public LLini(int val) {
        this.val = val;
    }

    public LLini(int val, LLini next) {
        this.val = val;
        this.next = next;
    }

    // Helper method to create a Linked List from an array
    public static LLini createList(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;
        LLini head = new LLini(arr[0]);
        LLini current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new LLini(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print the Linked List
    public static void printList(LLini head) {
        LLini current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
