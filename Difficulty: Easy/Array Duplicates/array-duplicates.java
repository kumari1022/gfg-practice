class Solution 
{
    public ArrayList<Integer> findDuplicates(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i=0;i<n;i++)
        {
            int val=Math.abs(arr[i]);  
            int idx=val-1;           

            if (arr[idx]<0)
            {
                
                result.add(val);
            } 
            else 
            {
                
                arr[idx]=-arr[idx];
            }
        }

        return result;
    }
}
