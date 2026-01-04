class Solution{
    public static int subArraySum(int[]arr,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0,count=0;
        for(int x:arr){
            sum+=x;
            if(map.containsKey(sum-k))count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
