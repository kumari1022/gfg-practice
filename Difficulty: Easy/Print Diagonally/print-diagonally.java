class Solution{
    static ArrayList<Integer> downwardDiagonal(int N,int A[][])
    {
        ArrayList<Integer>res=new ArrayList<>();
        for(int sum=0;sum<=2*(N-1);sum++)
        {
            for(int i=0;i<N;i++)
            {
                int j=sum-i;
                if(j>=0 && j<N)
                   res.add(A[i][j]);
            }
        }
        return res;
    }
}
