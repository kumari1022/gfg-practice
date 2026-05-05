import java.util.*;

class Solution {
    static String postToPre(String s) {
        Stack<String> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // if operand
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                // operator
                String op2 = stack.pop();
                String op1 = stack.pop();
                
                String temp = ch + op1 + op2;
                stack.push(temp);
            }
        }
        
        return stack.peek();
    }
}