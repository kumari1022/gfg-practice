// User function Template for Java
class Solution 
{
    static boolean armstrongNumber(int n) 
    {
        // code here
        int temp=n;
        int count=0;
        int k=n;
        while(k>0)
        {
            count++;
            k=k/10;
        }
        int sum=0;
        k=n;
        
        while(k>0)
        {
            int digit=k%10;
             sum=sum+(int)Math.pow(digit,count);
            k=k/10;
        }
        return (sum==temp);
    }
}