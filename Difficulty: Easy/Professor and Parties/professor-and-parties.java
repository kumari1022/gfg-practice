import java.util.*;
class Solution{
    public static String PartyType(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            if(!set.add(x))
                return "true";
        }
        return "false";
    }
}
