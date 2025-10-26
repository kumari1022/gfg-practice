class Solution{
    String secFrequent(String arr[],int N)
    {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:arr)map.put(s,map.getOrDefault(s,0)+1);
        int first=0,second=0;
        for(int v:map.values())
        {
            if(v>first)
            {
                second=first;
                first=v;
            }
            else if(v>second&&v<first){
                second=v;
            }
        }
        for(String k:map.keySet())
           if(map.get(k)==second)
              return k;
        return "";
    }
}
