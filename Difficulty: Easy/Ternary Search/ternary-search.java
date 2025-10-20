class Solution {
    public int findMinIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than its next, minimum is on the right
            if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                // If mid element is less than next, minimum is at mid or on the left
                right = mid;
            }
        }

        // left == right points to the minimum element
        return left;
    }
}