import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        
        HashSet<Integer> set = new HashSet<>();
        
        // add elements from a
        for(int x : a){
            set.add(x);
        }
        
        // add elements from b
        for(int x : b){
            set.add(x);
        }
        
        // convert to ArrayList
        return new ArrayList<>(set);
    }
}