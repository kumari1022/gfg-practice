import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Finds all possible triplets of indices (i, j, k) in arr[] such that 
     * arr[i] + arr[j] + arr[k] = 0 and i < j < k.
     * * @param arr The input integer array.
     * @return A List of Lists, where each inner list contains the three indices.
     */
    public List<List<Integer>> findTriplets(int[] arr) {
        // List to store the resulting triplets of indices
        List<List<Integer>> result = new ArrayList<>();
        int N = arr.length;
        
        // The array must have at least 3 elements for a triplet to exist
        if (N < 3) {
            return result; // Returns an empty list of lists
        }
        
        // Outer loop for the first index i
        // i goes up to N-3 to leave space for j (i+1) and k (i+2)
        for (int i = 0; i < N - 2; i++) {
            
            // Middle loop for the second index j
            // j starts from i + 1 to ensure i < j
            // j goes up to N-2 to leave space for k (j+1)
            for (int j = i + 1; j < N - 1; j++) {
                
                // Inner loop for the third index k
                // k starts from j + 1 to ensure j < k
                for (int k = j + 1; k < N; k++) {
                    
                    // Check if the sum of elements at indices i, j, k is zero
                    // Use long for the sum to prevent potential integer overflow, 
                    // although the constraints (-10^4 to 10^4) mean the sum is 
                    // between -3*10^4 and 3*10^4, which fits in an int. 
                    // Sticking with int is fine here based on constraints.
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        
                        // Triplet found: add the indices {i, j, k} to the result list
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(i);
                        triplet.add(j);
                        triplet.add(k);
                        result.add(triplet);
                    }
                }
            }
        }
        
        return result;
    }
}