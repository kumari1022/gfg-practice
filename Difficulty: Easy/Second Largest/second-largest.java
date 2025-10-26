class Solution 
{
    int getSecondLargest(int arr[])
    {
        Arrays.sort(arr);
        int largest=arr[arr.length - 1];
        for (int i=arr.length-2;i>=0;i--)
        {
            if (arr[i]<largest)
            {
                return arr[i]; 
            }
        }
        return -1;
    }
}
