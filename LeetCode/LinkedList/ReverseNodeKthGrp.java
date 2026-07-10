package LinkedList;

public class ReverseNodeKthGrp {

    public static LLini reverse(LLini head, int k) {
        if (head == null || k == 1 || head.next == null)
            return head;

        LLini dummy = new LLini();
        LLini groupPrev = dummy;
        groupPrev.next = head;
        LLini groupStart = head, groupEnd = head, nextGroup = null;
        int node_count;

        while (groupStart != null) {
            node_count = 1;
            while (node_count < k && groupEnd != null) {
                groupEnd = groupEnd.next;
                node_count++;
            }
            if (groupEnd == null && node_count < k)
                break;

            nextGroup = groupEnd.next;

            LLini current = groupStart, next_p = current.next, prev = groupEnd.next;

            node_count = 1;
            while (node_count <= k) {
                current.next = prev;

                prev = current;
                current = next_p;
                node_count++;
                if (current == null) {
                    break;
                }
                next_p = current.next;
            }
            groupStart = nextGroup;
        }
        return (dummy.next);
    }

    public static void main(String[] args) {
        LLini head = LLini.createList(new int[] { 1, 2, 3, 4, 5 });
        LLini ans = reverse(head, 3);
        LLini.printList(ans);

    }
}
