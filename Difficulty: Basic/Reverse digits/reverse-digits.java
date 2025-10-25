// User function Template for Java

class Solution 
{
    public int reverseDigits(int n)
    {
        // Code here
        int res;
        int rev=0;
        while(n!=0)
        {
             res=n%10;
             rev=rev*10+res;
             n=n/10;
        }
        return rev;
    }
}