class Solution{
    public static int[] rowSum(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        int[]res=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++)sum+=mat[i][j];
            res[i]=sum;
        }
        return res;
    }
}
