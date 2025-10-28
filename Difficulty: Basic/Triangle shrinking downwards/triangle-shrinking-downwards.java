class Solution {
    static String triDownwards(String S)
    {
        StringBuilder sb=new StringBuilder();
        int n=S.length();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
               sb.append('.');
            sb.append(S.substring(i));
        }
        return sb.toString();
    }
}
