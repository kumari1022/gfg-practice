class Solution
{
    int countFreq(int[] arr,int target)
    {
        int first=firstIndex(arr,target);
        if(first==-1)
            return 0;
        int last=lastIndex(arr,target);
           return last-first+1;
    }
    int firstIndex(int[] arr,int x)
    {
        int l=0,r=arr.length-1,res=-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(arr[m]==x){
                res=m;
                r=m-1;
            }
            else if(arr[m]<x)
                l=m+1;
            else 
                r=m-1;
        }
        return res;
    }
    int lastIndex(int[] arr,int x)
    {
        int l=0,r=arr.length-1,res=-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(arr[m]==x)
            {
                res=m;
                l=m+1;
            }
            else if(arr[m]<x)
                l=m+1;
            else 
                 r=m-1;
        }
        return res;
    }
}
