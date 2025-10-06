class Solution {
    static void reverseCol(int matrix[][]) {
        int n = matrix.length;
        if (n == 0) return;
        
        int m = matrix[0].length;
        if (m <= 1) return;

        // Iterate through each row (n)
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;

            // Reverse the elements in the current row (O(m) work)
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}