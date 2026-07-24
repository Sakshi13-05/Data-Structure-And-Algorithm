package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class NextGreaterElement {
    public static void next(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int j = nums2.length - 1; j >= 0; j--) {
            int current = nums2[j];
            while (!stack.isEmpty() && current >= stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                map.put(current, -1);
            } else {
                map.put(current, stack.peek());
            }

            stack.push(current);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 3, 1 };
        int[] nums2 = { 1, 3, 2, 4 };
        next(nums1, nums2);
    }
}
