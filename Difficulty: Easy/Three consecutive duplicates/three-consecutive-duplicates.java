import java.util.Stack;

class Solution {
    
    // Helper class to store character and its consecutive count
    private static class CharCount {
        char character;
        int count;

        public CharCount(char character, int count) {
            this.character = character;
            this.count = count;
        }
    }

    public String remove3ConsecutiveDuplicates(String S) {
        // Use a Stack to keep track of characters and their consecutive counts
        Stack<CharCount> stack = new Stack<>();
        
        for (char c : S.toCharArray()) {
            if (stack.isEmpty() || stack.peek().character != c) {
                // New character encountered: push with count 1
                stack.push(new CharCount(c, 1));
            } else {
                // Same character encountered: increment count
                CharCount top = stack.peek();
                top.count++;
                
                // If the count reaches 3, remove the trio by popping the element
                if (top.count == 3) {
                    stack.pop();
                }
            }
        }

        // Build the reduced string from the remaining characters in the stack
        StringBuilder reducedString = new StringBuilder();
        for (CharCount cc : stack) {
            // Append the character 'count' number of times
            for (int i = 0; i < cc.count; i++) {
                reducedString.append(cc.character);
            }
        }
        
        String result = reducedString.toString();
        
        // Note: The logic handles subsequent removals automatically. 
        // For example, if 'bbb' is removed, the characters before and after 
        // 'bbb' are now adjacent. The stack structure naturally handles this 
        // by placing the character before 'bbb' at the top, ready for the 
        // next comparison.

        // If the string is empty, return "-1"
        return result.isEmpty() ? "-1" : result;
    }
}