package LinkedList;

public class RemoveDuplicates {
    public static LLini remove(LLini listA) {
        LLini head = listA, write = head, read = head.next;
        while (read != null) {
            if (read.val > write.val) {
                write.next = read;
                write = write.next;
            }
            read = read.next;
        }
        write.next = null;
        return head;
    }

    public static void main(String[] args) {
        LLini listA = LLini.createList(new int[] { 1, 1, 2, 3, 3, 4, 4, 5, 5, 5 });
        LLini head = remove(listA);
        LLini.printList(head);
    }

}
