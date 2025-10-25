class Solution 
{
    public static int Count(int l,int r) 
    {
        boolean[] isPrime=new boolean[r + 1];
        for (int i=2;i<=r;i++)
            isPrime[i]=true;

        for(int i=2;i*i<=r;i++) {
            if(isPrime[i])
            {
                for(int j=i*i;j<=r;j+=i)
                    isPrime[j]=false;
            }
        }

        int primes=0,composites=0;

        for(int i=l;i<=r;i++)
        {
            if(i>=2)
            {
                if(isPrime[i])
                    primes++;
                else 
                    composites++;
            }
        }

        return Math.abs(composites-primes);
    }
}
