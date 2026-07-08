package LinkedList;

public class MergeOfTwoSortedList {

    public static LLini merge(LLini list1, LLini list2) {
        LLini dummy = new LLini();

        LLini current = dummy, temp1 = list1, temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                current.next = temp1;
                current = current.next;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                current = current.next;
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            current.next = temp1;
            current = current.next;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            current.next = temp2;
            current = current.next;
            temp2 = temp2.next;
        }
        return (dummy.next);
    }

    public static void main(String[] args) {

        LLini list1 = LLini.createList(new int[] { 1, 3, 6 });
        LLini list2 = LLini.createList(new int[] { 2, 3, 5 });
        LLini ans = merge(list1, list2);
        LLini.printList(ans);
    }

}
