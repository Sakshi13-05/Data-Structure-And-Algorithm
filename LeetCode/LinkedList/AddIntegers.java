package LinkedList;

public class AddIntegers {
    public static LLini add(LLini listA, LLini listB) {
        // 1. Create a dummy head to start the list
        LLini dummyHead = new LLini(0);
        LLini curr = dummyHead;

        LLini ptr1 = listA, ptr2 = listB;

        int carry = 0, sum = 0;

        while (ptr1 != null || ptr2 != null || carry != 0) {
            sum = carry;
            if (ptr1 != null) {
                sum += ptr1.val;
                ptr1 = ptr1.next;
            }
            if (ptr2 != null) {
                sum += ptr2.val;
                ptr2 = ptr2.next;
            }

            int digit = sum % 10;
            // Calculate the new carry (tens place)
            carry = sum / 10;

            // ATTACH the new node to the end of your list
            curr.next = new LLini(digit);

            // MOVE the pointer to that new node
            curr = curr.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        LLini listA = LLini.createList(new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9 });
        LLini listB = LLini.createList(new int[] { 9, 9, 9, 9 });
        LLini ans = add(listA, listB);
        LLini.printList(ans);
    }
}
