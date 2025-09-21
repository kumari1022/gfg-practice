import java.util.*;
class Solution{
    public int countSpecials(int k,List<Integer> arr){
        int n=arr.size(),cnt=0;
        int target=n/k;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr)map.put(x,map.getOrDefault(x,0)+1);
        for(int v:map.values())if(v==target)cnt++;
        return cnt;
    }
}
