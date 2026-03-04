import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> binTreeSortedLevels(int arr[],int n){
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        int i=0,level=1;

        while(i<n){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int j=0;j<level&&i<n;j++)
                temp.add(arr[i++]);
            Collections.sort(temp);
            res.add(temp);
            level*=2;
        }
        return res;
    }
}