class Solution{
    int longestUniqueSubstring(String s){
        int[]last=new int[26];
        for(int i=0;i<26;i++)last[i]=-1;
        int l=0,max=0;
        for(int r=0;r<s.length();r++){
            int idx=s.charAt(r)-'a';
            if(last[idx]>=l)l=last[idx]+1;
            last[idx]=r;
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
