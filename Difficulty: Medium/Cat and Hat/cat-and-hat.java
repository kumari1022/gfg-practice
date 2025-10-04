class Solution
{
    public static boolean cat_hat(String str)
    {
        int c=0,h=0;
        for(int i=0;i+2<str.length();i++)
        {
            if(str.substring(i,i+3).equals("cat"))
               c++;
            if(str.substring(i,i+3).equals("hat"))
               h++;
        }
        return c==h;
    }
}
