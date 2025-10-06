class Solution
{
    static void interchangeRows(int matrix[][])
    {
        int n1=matrix.length,m1=matrix[0].length;
        for(int i=0;i<n1/2;i++) {
            for(int j=0;j<m1;j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n1-1-i][j];
                matrix[n1-1-i][j]=temp;
            }
        }
    }
}
