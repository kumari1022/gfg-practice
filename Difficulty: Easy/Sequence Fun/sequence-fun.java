class Solution {
    public int NthTerm(int n) {
        int MOD = 1000000007;
        long a = 2;  // first term

        for (int i = 2; i <= n; i++) {
            a = (a * i + 1) % MOD;
        }

        return (int)a;
    }
}
