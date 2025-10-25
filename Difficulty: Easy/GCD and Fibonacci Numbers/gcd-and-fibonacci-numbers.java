// User function Template for Java
class Solution
{
    static int fibGcd(int M, int N) 
    {
        int g=gcd(M, N);
        return fibMod(g,100);
    }

    static int gcd(int a,int b)
    {
        while (b!=0) 
        {
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }

    static int fibMod(int n,int mod)
    {
        if(n==0)
           return 0;
        if(n==1) 
           return 1;

        long a=0,b=1;
        for (int i=2;i<=n;i++) 
        {
            long c=(a+b)%mod;
            a=b;
            b=c;
        }
        return (int)b;
    }
}