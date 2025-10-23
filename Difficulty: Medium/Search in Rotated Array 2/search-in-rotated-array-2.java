class Solution
{
    public boolean search(int[] arr,int key)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==key)
               return true;
            if(arr[low]==arr[mid] && arr[mid]==arr[high])
            {
                low++;high--;
            }
            else if(arr[low]<=arr[mid])
            {
                if(key>=arr[low] && key<arr[mid])
                  high=mid-1;
                else 
                  low=mid+1;
            }
            else
            {
                if(key>arr[mid] && key<=arr[high]) 
                   low=mid+1;
                else 
                   high=mid-1;
            }
        }
        return false;
    }
}
