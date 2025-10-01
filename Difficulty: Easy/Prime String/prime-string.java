// User function Template for Java

class Solution {
    public boolean isPrimeString(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += (int)(s.charAt(i));
        }

        return isPrime(sum);
    }

    private boolean isPrime(int n) {
        if (n <= 1)
           return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
               return false;
        }
        return true;
    }
}
