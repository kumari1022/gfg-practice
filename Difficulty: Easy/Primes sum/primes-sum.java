// User function Template for Java
class Solution 
{
    static String isSumOfTwo(int N)
    {
        for(int i=2;i<=N/2;i++) 
        {
            if (isPrime(i)==1)
            {
                if(isPrime(N-i)==1)
                
                return "Yes";
            }
        }
        return "No";
    }

    static int isPrime(int N)
    {
        if (N<=1) 
           return 0; 
        for(int i=2;i<=Math.sqrt(N);i++)
        {
            if (N%i==0) 
            {
                return 0; 
            }
        }
        return 1; 
    }
}
