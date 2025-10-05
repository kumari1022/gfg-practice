class Solution
{
    public int maximum_distance(String s)
    {
        int n=s.length();
        int[] lastIndex=new int[26];
        for(int i=0;i<26;i++)
            lastIndex[i]=-1;
        int maxDist=-1;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            int ci=c-'a';
            if(ci==0)
               lastIndex[0]=i;
            else if(lastIndex[ci-1]!=-1)
            {
                lastIndex[ci]=i;
                maxDist=Math.max(maxDist,i+1);
            }
        }
        return maxDist==-1?-1:maxDist;
    }
}
