class Solution 
{
    int fibonacciDigits(long N) 
    {
        if (N == 0) 
           return 0;
        N=N % 300;
        
        if(N==0) 
           return 0;
        
        long a=0,b=1;
        for(long i=2;i<=N;i++) 
        {
            long c=(a+b)%100;
            a=b;
            b=c;
        }
        
        int result=(int)b%100;
        return result;
    }
}
