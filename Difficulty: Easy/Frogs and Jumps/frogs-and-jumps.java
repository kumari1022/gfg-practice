class Solution{
    public int unvisitedLeaves(int N,int leaves,int frogs[]){
        boolean vis[]=new boolean[leaves+1];
        for(int i=0;i<N;i++){
            int k=frogs[i];
            if(k<=leaves&&!vis[k]){
                for(int j=k;j<=leaves;j+=k)vis[j]=true;
            }
        }
        int cnt=0;
        for(int i=1;i<=leaves;i++)if(!vis[i])cnt++;
        return cnt;
    }
}
