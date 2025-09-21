class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int n = arr.length;
        int lessOrEqualCount = 0;
        int greaterOrEqualCount = 0;

        // Binary search to find the count of elements less than or equal to the target.
        // We're looking for the index of the last element that is <= target.
        int left = 0, right = n - 1;
        int countLTE = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                countLTE = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        lessOrEqualCount = countLTE;

        // Binary search to find the count of elements greater than or equal to the target.
        // We're looking for the index of the first element that is >= target.
        left = 0;
        right = n - 1;
        int countGTE = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                countGTE = n - mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        greaterOrEqualCount = countGTE;

        return new int[]{lessOrEqualCount, greaterOrEqualCount};
    }
}