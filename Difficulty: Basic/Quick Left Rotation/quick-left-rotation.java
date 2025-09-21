class Solution{
    void leftRotate(int arr[],int k){
        int n=arr.length;
        k%=n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    void reverse(int[] arr,int l,int r){
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;r--;
        }
    }
}
