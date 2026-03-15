class Solution{
    public void deleteMid(Stack<Integer>s){
        int n=s.size();
        int mid=(n/2)+1;
        solve(s,mid);
    }
    void solve(Stack<Integer>s,int k){
        if(k==1){
            s.pop();
            return;
        }
        int x=s.pop();
        solve(s,k-1);
        s.push(x);
    }
}