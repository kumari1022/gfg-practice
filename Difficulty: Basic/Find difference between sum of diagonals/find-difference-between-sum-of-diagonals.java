class Solution
{
    int diagonalSumDifference(int N, int[][] Grid)
    {
        int primary=0, secondary=0;
        for(int i=0;i<N;i++)
        {
            primary += Grid[i][i];
            secondary += Grid[i][N-1-i];
        }
        return Math.abs(primary - secondary);
    }
}
