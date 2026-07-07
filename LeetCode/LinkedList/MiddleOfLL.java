package LinkedList;

public class MiddleOfLL {
    public static int middle(LLini head) {
        LLini fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return (slow.val);
    }

    public static void main(String[] args) {
        LLini head = LLini.createList(new int[] { 1, 2, 3, 4, 5 });
        int ans = middle(head);
        System.out.println(ans);
    }
}
