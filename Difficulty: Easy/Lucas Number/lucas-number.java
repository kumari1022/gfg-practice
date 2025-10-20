class Solution {
    public long lucas(int n) {
        long MOD = 1000000007;

        if (n == 0) return 2;
        if (n == 1) return 1;

        long a = 2, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % MOD;
            a = b;
            b = c;
        }

        return c;
    }
}
