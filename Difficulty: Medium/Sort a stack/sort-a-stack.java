import java.util.*;
class Solution {
    public void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) 
           return;

        int top = st.pop();

        sortStack(st);
        insert(st, top);
    }
    void insert(Stack<Integer> st, int x) {

        if (st.isEmpty()||st.peek()<=x) {
            st.push(x);
            return;
        }
        int temp=st.pop();
        insert(st, x);
        st.push(temp);
    }
}