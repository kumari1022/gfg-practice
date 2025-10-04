class Solution{
    public int count(String s){
        int[] freq=new int[26];
        for(char ch:s.toCharArray())
             freq[ch-'a']++;
        int countEven=0;
        for(int f:freq)
            if(f>0&&f%2==0)
                 countEven++;
        return countEven;
    }
}
