import java.util.*;
class Solution{
    public long getNextEven(String x){
        char[] arr=x.toCharArray();
        int n=arr.length;
        if(!hasEvenDigit(arr))return -1;
        if(!nextPermutation(arr))return -1;
        while(arr[n-1]%2!=0){
            if(!nextPermutation(arr))return -1;
        }
        return Long.parseLong(new String(arr));
    }
    
    boolean hasEvenDigit(char[] arr){
        for(char c:arr)if((c-'0')%2==0)return true;
        return false;
    }
    
    boolean nextPermutation(char[] arr){
        int i=arr.length-2;
        while(i>=0&&arr[i]>=arr[i+1])i--;
        if(i<0)return false;
        int j=arr.length-1;
        while(arr[j]<=arr[i])j--;
        swap(arr,i,j);
        reverse(arr,i+1,arr.length-1);
        return true;
    }
    
    void swap(char[] arr,int i,int j){
        char t=arr[i];arr[i]=arr[j];arr[j]=t;
    }
    
    void reverse(char[] arr,int i,int j){
        while(i<j)swap(arr,i++,j--);
    }
}
