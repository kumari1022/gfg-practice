class Solution{
    public int smallestSubstring(String S){
        int[] f=new int[3];
        int c=0,l=0,ans=Integer.MAX_VALUE;
        for(int r=0;r<S.length();r++){
            int x=S.charAt(r)-'0';
            if(f[x]++==0)c++;
            while(c==3){
                ans=Math.min(ans,r-l+1);
                int y=S.charAt(l)-'0';
                if(--f[y]==0)c--;
                l++;
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
