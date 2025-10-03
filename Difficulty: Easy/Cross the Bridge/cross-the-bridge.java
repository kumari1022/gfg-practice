class Solution{
    static int findDays(String S)
    {
        int maxJump=0,days=0,count=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='.') 
                 count++;
            else{
                if(count>maxJump)
            {
                  days++;maxJump=count;
                
            }
                count=0;
            }
        }
        return days;
    }
}
