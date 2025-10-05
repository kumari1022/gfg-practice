import java.util.*;
class Solution{
    public int[] common_digits(int[] nums){
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            while(num>0){
                int digit=num%10;
                set.add(digit);
                num/=10;
            }
        }
        List<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        int[]res=new int[list.size()];
        for(int i=0;i<list.size();i++)res[i]=list.get(i);
        return res;
    }
}
