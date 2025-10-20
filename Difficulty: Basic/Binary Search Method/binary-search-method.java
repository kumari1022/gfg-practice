class Solution {
    public static int binarySearchArray(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // prevents overflow
            
            if (arr[mid] == k) {
                return mid; // element found
            } else if (arr[mid] < k) {
                left = mid + 1; // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }

        return -1; // element not found
    }
}