class Solution{
    boolean check_elements(int arr[],int n,int A,int B){
        boolean present[]=new boolean[B-A+1];
        for(int i=0;i<n;i++){
            if(arr[i]>=A&&arr[i]<=B)present[arr[i]-A]=true;
        }
        for(int i=0;i<=B-A;i++){
            if(!present[i])return false;
        }
        return true;
    }
}
