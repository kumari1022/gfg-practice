class Solution {
    public int DiagonalSum(int[][] a) {
        int n = a.length;
        int s = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) s += a[i][j];
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) s += a[i][j];
            }
        }
        
        return s;
    }
}
