class Solution{
    static int checkCompressed(String S, String T)
    {
        int i=0,j=0;
        while(i<S.length() && j<T.length())
        {
            if(Character.isLetter(T.charAt(j)))
            {
                if(S.charAt(i)!=T.charAt(j))
                    return 0;
                i++; j++;
            } 
            else
            {
                int num=0;
                while(j<T.length() && Character.isDigit(T.charAt(j)))
                {
                    num=num*10+(T.charAt(j)-'0');
                    j++;
                }
                i+=num;
            }
        }
        return i==S.length() && j==T.length()?1:0;
    }
}
