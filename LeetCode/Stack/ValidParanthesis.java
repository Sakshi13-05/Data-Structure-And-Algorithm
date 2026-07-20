package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParanthesis {
    public static boolean check(String s) {
        if (s.isEmpty())
            return true;

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty())
                    return false;

                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty())
                    return false;

                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty())
                    return false;

                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty())
            return false;

        return true;
    }

    public static void main(String[] args) {
        boolean ans = check("{}[]()");
        System.out.println(ans);
    }
}
