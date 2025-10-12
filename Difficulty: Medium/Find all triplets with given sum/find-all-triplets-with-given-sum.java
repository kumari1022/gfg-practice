class Solution{
    public ArrayList<ArrayList<Integer>> findTriplets(int[] arr,int k){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            if(i>0&&arr[i]==arr[i-1]) continue;
            int left=i+1,right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==k){
                    res.add(new ArrayList<>(Arrays.asList(arr[i],arr[left],arr[right])));
                    while(left<right&&arr[left]==arr[left+1]) left++;
                    while(left<right&&arr[right]==arr[right-1]) 
                       right--;
                    left++;right--;
                }else if(sum<k)
                   left++;
                else
                   right--;
            }
        }
        return res;
    }
}
