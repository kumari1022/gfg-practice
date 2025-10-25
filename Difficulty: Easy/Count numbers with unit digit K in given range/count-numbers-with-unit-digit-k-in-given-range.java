class Solution 
{
    static int countLastDigitK(Long low,Long high,Long K)
    {
        return (int)(countUpto(high, K)-countUpto(low-1,K));
    }
    static long countUpto(long x, long K) 
    {
        if (x<0)
            return 0; 
        long cnt=x/10;
        if (x%10>=K)
            cnt++;
        return cnt;
    }
}
