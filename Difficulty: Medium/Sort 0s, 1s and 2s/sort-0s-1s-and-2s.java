class Solution {
    /**
     * Sorts an array containing only 0s, 1s, and 2s using the Dutch National Flag Algorithm.
     * Time Complexity: O(n) (one pass)
     * Auxiliary Space: O(1)
     */
    public void sort012(int[] arr) {
        int low = 0;       // Tracks the next position for a 0
        int mid = 0;       // Current element being processed
        int high = arr.length - 1; // Tracks the next position for a 2
        
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // If element is 0, swap it with arr[low] and move both pointers
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // If element is 1, it's already in the correct middle section, just move mid
                    mid++;
                    break;
                case 2:
                    // If element is 2, swap it with arr[high] and move high pointer
                    // DO NOT increment mid, as the swapped element at arr[mid] must be checked
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    // Helper function to swap two elements
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}