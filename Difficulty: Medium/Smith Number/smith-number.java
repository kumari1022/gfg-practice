class Solution {
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Function to get sum of digits of a number
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int smithNum(int n) {
        // Step 1: Check if n is prime
        if (isPrime(n))
            return 0;

        int temp = n;
        int sumDigits = sumOfDigits(n);
        int factorDigitSum = 0;

        // Step 2: Find prime factors and their digit sums
        for (int i = 2; i * i <= temp; i++) {
            while (temp % i == 0) {
                factorDigitSum += sumOfDigits(i);
                temp /= i;
            }
        }

        // If remaining part is a prime factor greater than sqrt(n)
        if (temp > 1)
            factorDigitSum += sumOfDigits(temp);

        // Step 3: Compare both sums
        if (sumDigits == factorDigitSum)
            return 1;
        else
            return 0;
    }
}
