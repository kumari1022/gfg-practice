class Solution
{
    static int isHappy(int N)
    {
        HashSet<Integer> seen=new HashSet<>();
        while (N!=1&&!seen.contains(N)) 
        {
            seen.add(N);
            N = digitSquareSum(N);
        }
      return (N==1)?1:0;
    }
    static int digitSquareSum(int num) 
    {
        int sum=0;
        while (num>0) 
        {
            int d=num%10;
            sum+=d*d;
            num/=10;
        }
        return sum;
    }
}
