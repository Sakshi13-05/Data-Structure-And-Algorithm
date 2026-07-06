package LinkedList;

public class ReverseALL {
    public static LLini reverse(LLini head) {
        LLini prev_p = null, current_p = head, next_p = current_p.next;

        while (current_p != null) {
            current_p.next = prev_p;

            prev_p = current_p;
            current_p = next_p;
            if (current_p == null)
                break;
            next_p = current_p.next;
        }
        return prev_p;
    }

    public static void main(String[] args) {
        // Step 1: Create a Linked List from an array easily
        LLini head = LLini.createList(new int[] { 1, 2, 3, 4, 5 });

        // Step 2: Print the original linked list
        System.out.println("Original List:");
        LLini.printList(head);

        LLini ans = reverse(head);

        System.out.println("\nAfter reversing:");
        LLini.printList(ans);
    }
}
