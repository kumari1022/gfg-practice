class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak
            boolean leftOk = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == n - 1 || arr[mid] > arr[mid + 1]);

            if (leftOk && rightOk) {
                return mid;
            }

            // If left neighbor is greater, move left
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } 
            // Otherwise move right
            else {
                low = mid + 1;
            }
        }

        return -1; 
    }
}
