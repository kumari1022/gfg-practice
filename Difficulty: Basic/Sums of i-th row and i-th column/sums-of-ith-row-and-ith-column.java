class Solution {
    int sumOfRowCol(int N,int M,int A[][]) {
        int limit=Math.min(N,M);
        for(int i=0;i<limit;i++) {
            int rowSum=0,colSum=0;
            for(int j=0;j<M;j++) 
                rowSum+=A[i][j];
            for(int j=0;j<N;j++) 
                colSum+=A[j][i];
            if(rowSum!=colSum) 
               return 0;
        }
        return 1;
    }
}
