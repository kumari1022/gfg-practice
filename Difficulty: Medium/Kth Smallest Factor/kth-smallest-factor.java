class Solution 
{
    static int kThSmallestFactor(int n, int k)
    {
        java.util.List<Integer> factors = new java.util.ArrayList<>();

        for (int i=1;i*i<=n;i++)
        {
            if (n%i==0) 
            {
                factors.add(i); 
                if (i!=n/i) 
                {
                    factors.add(n/i); 
                }
            }
        }

        java.util.Collections.sort(factors);

        if (k>factors.size())
        {
            return -1;
        }
        return factors.get(k-1); 
    }
}
