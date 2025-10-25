// User function Template for Java
class Solution 
{
    static int fullPrime(int N)
    {
        // code here
        if(!isPrime(N))
          return 0;
         int temp=N;
         while(temp>0)
         {
             int digit=temp%10;
             if(!(digit==2||digit==3||digit==5||digit==7))
             {
                 return 0;
             }
             temp/=10;
         }
         return 1;
    }
    static boolean isPrime(int num)
    {
        if(num<=1)
         return false;
         for(int i=2;i*i<=num;i++)
         {
             if(num%i==0)
              return false;
         }
         return true;
    }
    }