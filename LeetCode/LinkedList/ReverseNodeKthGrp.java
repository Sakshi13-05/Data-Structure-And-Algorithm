package LinkedList;

public class ReverseNodeKthGrp {

    public static LLini reverse(LLini head, int k) {
        if (head == null || k == 1 || head.next == null)
            return head;

        LLini dummy = new LLini();
        dummy.next = head;

        LLini prevGrp = dummy, grpStart = head, grpEnd;
        int i;

        while (grpStart != null) {
            grpEnd = grpStart;

            for (i = 1; i < k && grpEnd != null; i++) {
                grpEnd = grpEnd.next;
            }
            if (grpEnd == null)
                break;

            LLini nextGrp = grpEnd.next;

            LLini current = grpStart, prev = nextGrp, next_p = current.next;

            while (current != nextGrp) {
                current.next = prev;

                prev = current;
                current = next_p;
                if (current == null)
                    break;
                next_p = current.next;
            }
            prevGrp.next = prev;
            prevGrp = grpStart;
            grpStart = nextGrp;

        }
        return (dummy.next);

    }

    public static void main(String[] args) {
        LLini head = LLini.createList(new int[] { 1, 2, 3, 4, 5, 6 });
        LLini ans = reverse(head, 3);
        LLini.printList(ans);

    }
}
