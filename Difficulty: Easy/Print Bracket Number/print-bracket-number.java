// User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        int num = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                num++;
                stack.push(num);
                result.add(num);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    result.add(stack.pop());
                }
            }
        }

        return result;
    }
};