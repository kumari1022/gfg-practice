class Solution
{
    public static int[] colSum(int[][] mat)
    {
        int n=mat.length;
        int m=mat[0].length;
        int[]ans=new int[m];
        for(int i=0;i<m;i++)
        {
            int sm=0;
            for(int j=0;j<n;j++)
            {
                sm+=mat[j][i];
            }
            ans[i]=sm;
        }
        return ans;
    }
}
