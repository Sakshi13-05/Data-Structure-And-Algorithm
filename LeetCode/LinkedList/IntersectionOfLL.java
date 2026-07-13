package LinkedList;

public class IntersectionOfLL {
    public static LLini intersect(LLini listA, LLini listB) {
        int lenA = 0, lenB = 0;
        LLini temp = listA;
        while (temp != null) {
            lenA++;
            temp = temp.next;
        }
        System.out.println(lenA);
        temp = listB;
        while (temp != null) {
            lenB++;
            temp = temp.next;
        }
        System.out.println(lenB);
        int diff = (lenA >= lenB) ? (lenA - lenB) : (lenB - lenA);
        System.out.println(diff);
        LLini pA = null, pB = null;
        if (lenA > lenB) {
            pA = listA;
            for (int i = 0; i < diff; i++) {
                pA = pA.next;
            }
            pB = listB;
        } else if (lenB > lenA) {
            pB = listB;
            for (int i = 0; i < diff; i++) {
                pB = pB.next;
            }
            pA = listA;
        } else {
            pA = listA;
            pB = listB;
        }
        while (pA != pB) {
            pA = pA.next;
            pB = pB.next;
        }
        return (pA);
    }

    public static void main(String[] args) {
        LLini listA = LLini.createList(new int[] { 1, 2, 3, 4, 5, 6 });
        LLini listB = LLini.createList(new int[] { 8, 9, 4, 5, 6 });

        LLini ans = intersect(listA, listB);
        System.out.println(ans);
    }
}
