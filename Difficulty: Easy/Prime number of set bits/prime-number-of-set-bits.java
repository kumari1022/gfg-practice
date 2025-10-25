// User function Template for Java
class Solution
{
    public int primeSetBits(int L,int R) 
    {
        int count = 0;
        
        for(int num=L;num<=R;num++)
        {
            int setBits=Integer.bitCount(num); 
            
            if (isPrime(setBits))
            {
                count++;
            }
        }
        
        return count;
    }
    private boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        
        for(int i = 3; i * i <= n; i += 2) 
        {
            if (n%i==0) 
               return false;
        }
        return true;
    }
}
