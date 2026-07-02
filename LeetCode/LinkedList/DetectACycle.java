package LinkedList;

public class DetectACycle {
    int val;
    DetectACycle next;

    DetectACycle(int x) {
        val = x;
        next = null;
    }

    public static boolean hasCycle(DetectACycle head) {
        DetectACycle slow = head;
        DetectACycle fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        DetectACycle d1 = new DetectACycle(10);
        DetectACycle d2 = new DetectACycle(20);
        DetectACycle d3 = new DetectACycle(30);
        DetectACycle d4 = new DetectACycle(140);
        DetectACycle d5 = new DetectACycle(105);

        // Linking the nodes together
        d1.next = d2;
        d2.next = d3;
        d3.next = d4;
        d4.next = d5;

        // Creating a cycle here: connecting d5 back to d3
        d5.next = d3;

        boolean ans = hasCycle(d1);
        System.out.println(ans);
    }
}
