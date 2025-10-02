import java.util.*;
class Solution{
    public int maxChars(String s){
        int[] firstIndex=new int[256];
        Arrays.fill(firstIndex,-1);
        int max=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(firstIndex[c]==-1)
                firstIndex[c]=i;
            else max=Math.max(max,i-firstIndex[c]-1);
        }
        return max;
    }
}
