// User function Template for Java
class Solution 
{
    static String checkFibonacci(int N)
    {
        if (isFibo(N))
            return "Yes";
        return "No";
    }
    static boolean isFibo(int n)
    {
        long x1=5L*n*n+4;
        long x2=5L*n*n-4;
        return perfect(x1)||perfect(x2);
    }
    static boolean perfect(long n)
    {
        long res=(long)Math.sqrt(n);
        return res*res==n;
    }
}