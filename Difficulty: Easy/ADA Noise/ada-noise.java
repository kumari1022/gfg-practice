class Solution
{
    static String updateString(String S)
    {
        StringBuilder clean=new StringBuilder(),noise=new StringBuilder();
        for(int i=0;i<S.length();)
        {
            if(S.startsWith("ada",i))
            {
                int j=i+3;
                while(j+1<S.length()&&S.startsWith("da",j))
                   j+=2;
                noise.append(S.substring(i,j));
                i=j;
            }
            else
            {
                clean.append(S.charAt(i));
                i++;
            }
        }
        return clean.append(noise).toString();
    }
}
