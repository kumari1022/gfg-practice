import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Finds the boundary elements of an n x n matrix in the order they appear.
     * @param matrix The square matrix.
     * @return An array containing the boundary elements.
     */
    public int[] BoundaryElements(int[][] matrix) {
        int n = matrix.length;
        
        // If the matrix is 1x1, the single element is the boundary.
        if (n == 1) {
            return new int[]{matrix[0][0]};
        }
        
        // Use an ArrayList to dynamically store the boundary elements.
        List<Integer> boundaryList = new ArrayList<>();

        // Iterate through all elements of the matrix (O(n^2) time)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                // Check if the element is on the boundary:
                // First Row (i = 0) OR Last Row (i = n - 1)
                // OR First Column (j = 0) OR Last Column (j = n - 1)
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    boundaryList.add(matrix[i][j]);
                }
            }
        }
        
        // Convert the List<Integer> to an int[] array for the return type.
        int[] result = new int[boundaryList.size()];
        for (int k = 0; k < boundaryList.size(); k++) {
            result[k] = boundaryList.get(k);
        }
        
        return result;
    }
}