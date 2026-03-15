class Solution
{
    static Stack<Integer>deleteMid(int n,Stack<Integer>st)
    {
        int mid=(n/2)+1;
        solve(st,mid);
        return st;
    }
    static void solve(Stack<Integer>st,int k)
    {
        if(k==1)
        {
            st.pop();
            return;
        }
        int x=st.pop();
        solve(st,k-1);
        st.push(x);
    }
}