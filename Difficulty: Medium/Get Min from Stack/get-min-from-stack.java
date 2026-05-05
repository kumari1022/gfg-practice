import java.util.*;

class SpecialStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public SpecialStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int peek() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getMin() {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }
}