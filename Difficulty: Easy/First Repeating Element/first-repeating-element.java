class Solution{
    public static int firstRepeated(int[] arr) 
    {
        java.util.HashMap<Integer,Integer> m=new java.util.HashMap<>();
        int minIndex=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i]))minIndex=Math.min(minIndex,m.get(arr[i]));
            else m.put(arr[i],i);
        }
        return (minIndex==Integer.MAX_VALUE)?-1:minIndex+1;
    }
}
