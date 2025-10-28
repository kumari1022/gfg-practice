class Solution
{
    int columnWithMaxZeros(int[][] arr,int N)
    {
        int maxZeros=0,colIndex=-1;
        for(int j=0;j<N;j++)
        {
            int count=0;
            for(int i=0;i<N;i++)
               if(arr[i][j]==0)
                   count++;
            if(count>maxZeros)
            {
                maxZeros=count;
                colIndex=j;
            }
        }
        return maxZeros==0?-1:colIndex;
    }
}
