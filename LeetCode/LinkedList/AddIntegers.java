package LinkedList;

public class AddIntegers {
    public static LLini add(LLini listA, LLini listB) {
        // 1. Create a dummy head to start the list
        LLini dummyHead = new LLini(0);
        LLini curr = dummyHead;
        LLini ptr1 = listA, ptr2 = listB;
        int carry = 0, sum = 0;
        while (ptr1 != null && ptr2 != null) {
            sum = ptr1.val + ptr2.val + carry;
            int quo = sum / 10;
            int rem = sum % 10;
            if (quo != 0) {
                carry = quo;
                curr.next = new LLini(rem);
            } else {
                carry = 0;
                curr.next = new LLini(rem);
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr1 == null) {
            while (ptr2 != null) {
                sum = ptr2.val + carry;
                int quo = sum / 10;
                int rem = sum % 10;
                if (quo != 0) {
                    carry = quo;
                    curr.next = new LLini(rem);
                } else {
                    carry = 0;
                    curr.next = new LLini(rem);
                }
                ptr2 = ptr2.next;
            }
        }
        if (ptr2 == null) {
            while (ptr1 != null) {
                sum = ptr1.val + carry;
                int quo = sum / 10;
                int rem = sum % 10;
                if (quo != 0) {
                    carry = quo;
                    curr.next = new LLini(rem);
                } else {
                    carry = 0;
                    curr.next = new LLini(rem);
                }
                ptr1 = ptr1.next;
            }
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
