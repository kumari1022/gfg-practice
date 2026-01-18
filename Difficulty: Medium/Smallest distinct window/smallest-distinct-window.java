class Solution{
    public int findSubString(String str){
        int n=str.length();
        boolean[] present=new boolean[26];
        int distinct=0;
        for(int i=0;i<n;i++){
            int idx=str.charAt(i)-'a';
            if(!present[idx]){
                present[idx]=true;
                distinct++;
            }
        }
        int[] freq=new int[26];
        int count=0,l=0,ans=n;
        for(int r=0;r<n;r++){
            int id=str.charAt(r)-'a';
            freq[id]++;
            if(freq[id]==1)count++;
            while(count==distinct){
                ans=Math.min(ans,r-l+1);
                int lid=str.charAt(l)-'a';
                freq[lid]--;
                if(freq[lid]==0)count--;
                l++;
            }
        }
        return ans;
    }
}
