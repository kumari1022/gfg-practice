import java.util.*;
class Solution{
    int findSum(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int x:arr){
            if(set.add(x))sum+=x;
        }
        return sum;
    }
}
