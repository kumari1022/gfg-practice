class Solution
{
    int transitionPoint(int[] arr)
    {
        int n=arr.length;
        int l=0,r=n-1,res=-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(arr[m]==1)
            {
                res=m;
                r=m-1;
            }
            else 
              l=m+1;
        }
        return res;
    }
}
