import java.util.*;

class Solution {
    static String preToPost(String s) {
        Stack<String> stack = new Stack<>();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                
                String temp = op1 + op2 + ch;
                stack.push(temp);
            }
        }
        
        return stack.peek();
    }
}