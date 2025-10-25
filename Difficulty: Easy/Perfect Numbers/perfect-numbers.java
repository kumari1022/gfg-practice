class Solution
{
    static boolean isPerfect(int n)
    {
        // code here
        if(n==1)
          return false;
        int sum=1;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
                int q=n/i;
                if(q !=i)
                {
                    sum=sum+q;
                }
                
            }
        }
        return sum==n;
        
    }
};