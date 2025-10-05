class Solution{
    static long sumMatrix(long n,long q){
        if(q<2 || q>2*n) return 0;
        long low = Math.max(1, q-n);
        long high = Math.min(n, q-1);
        return Math.max(0, high-low+1);
    }
}
