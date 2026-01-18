import java.util.*;

class Solution{
    static int toyCount(int N,int K,int arr[]){
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<N;i++){
            if(K>=arr[i]){
                K-=arr[i];
                c++;
            }else{
                break;
            }
        }
        return c;
    }
}
