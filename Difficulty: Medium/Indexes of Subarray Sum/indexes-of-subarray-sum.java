class Solution{
    static ArrayList<Integer> subarraySum(int[]arr,int target){
        ArrayList<Integer>res=new ArrayList<>();
        int l=0;
        long sum=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            while(sum>target&&l<=r){
                sum-=arr[l];
                l++;
            }
            if(sum==target){
                res.add(l+1);
                res.add(r+1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}