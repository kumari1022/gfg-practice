import java.util.*;

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q.size() < k) return q;
        
        Stack<Integer> stack = new Stack<>();
        
        // Step 1: Remove first k elements and push into stack
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }
        
        // Step 2: Push stack elements back to queue
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        
        // Step 3: Move remaining elements to back
        int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.add(q.poll());
        }
        
        return q;
    }
}