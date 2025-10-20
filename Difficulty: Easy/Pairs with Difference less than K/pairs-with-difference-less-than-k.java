import java.util.Arrays;

class Solution {
    public static int countPairs(int arr[], int k) {
        int n = arr.length;
        Arrays.sort(arr); // O(n log n)
        
        int count = 0;
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            // Move j to find first element with difference >= k
            while (j < n && arr[j] - arr[i] < k) {
                j++;
            }
            // Number of pairs with i is (j - i - 1)
            count += j - i - 1;
        }
        
        return count;
    }
}
