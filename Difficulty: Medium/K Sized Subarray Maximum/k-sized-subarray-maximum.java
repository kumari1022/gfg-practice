import java.util.*;
class Solution{
    public ArrayList<Integer> maxOfSubarrays(int[]arr,int k){
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
        Deque<Integer>d=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!d.isEmpty()&&d.peekFirst()<=i-k)d.pollFirst();
            while(!d.isEmpty()&&arr[d.peekLast()]<arr[i])d.pollLast();
            d.offerLast(i);
            if(i>=k-1)res.add(arr[d.peekFirst()]);
        }
        return res;
    }
}
