package LinkedList;

public class RemoveNthNodeFromEnd {
    public static LLini remove(LLini list1, int n) {
        LLini dummy = new LLini();
        dummy.next = list1;
        LLini current = dummy, temp = dummy;
        for (int i = 1; i <= n; i++) {
            temp = temp.next;
        }
        while (temp.next != null) {
            current = current.next;
            temp = temp.next;
        }
        current.next = current.next.next;
        return (dummy.next);
    }

    public static void main(String[] args) {
        LLini list1 = LLini.createList(new int[] { 1, 2, 3, 4, 5 });
        LLini ans = remove(list1, 5);
        LLini.printList(ans);
    }
}
