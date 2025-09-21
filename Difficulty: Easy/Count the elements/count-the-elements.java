class Solution{
    public static int[] countElements(int a[],int b[],int n,int query[],int q){
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]>max)max=a[i];
            if(b[i]>max)max=b[i];
        }
        int freq[]=new int[max+1];
        for(int i=0;i<n;i++)
           freq[b[i]]++;
        for(int i=1;i<=max;i++)
           freq[i]+=freq[i-1];
        int ans[]=new int[q];
        for(int i=0;i<q;i++){
            ans[i]=freq[a[query[i]]];
        }
        return ans;
    }
}
