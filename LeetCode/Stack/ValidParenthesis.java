package Stack;

import java.util.ArrayDeque;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{{}()}";

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.peek() != c) {
                    System.out.println(false);
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println(true);
        }
    }
}
