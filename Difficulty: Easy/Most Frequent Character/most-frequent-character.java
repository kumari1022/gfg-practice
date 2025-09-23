class Solution{
    public char getMaxOccuringChar(String s)
    {
        int[] freq=new int[26];
        for(char c:s.toCharArray())freq[c-'a']++;
        int max=0;char ans='z';
        for(int i=0;i<26;i++){
            if(freq[i]>max||(freq[i]==max&&(char)(i+'a')<ans))
            {
                max=freq[i];
                ans=(char)(i+'a');
            }
        }
        return ans;
    }
}
