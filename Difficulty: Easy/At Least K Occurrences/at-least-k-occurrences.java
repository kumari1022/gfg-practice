class Solution {
    public int firstElementKTime(int[] arr,int k) 
    {
        LinkedHashMap<Integer, Integer> lhm=new LinkedHashMap<>();
        for (int i=0;i<arr.length;i++) 
        {
            lhm.put(arr[i],lhm.getOrDefault(arr[i], 0)+1);
            if (lhm.get(arr[i])==k)
            {
                return arr[i];
            }
        }
        return -1; 
    }
}