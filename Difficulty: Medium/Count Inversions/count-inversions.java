class Solution {
    static int inversionCount(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n]; // helper array for merging
        return mergeSort(arr, temp, 0, n - 1);
    }

    static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Count inversions in left half
            invCount += mergeSort(arr, temp, left, mid);

            // Count inversions in right half
            invCount += mergeSort(arr, temp, mid + 1, right);

            // Count split inversions while merging
            invCount += merge(arr, temp, left, mid, right);
        }
        return invCount;
    }

    static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;      // left subarray index
        int j = mid + 1;   // right subarray index
        int k = left;      // temp array index
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                // arr[i] > arr[j], so all elements from i..mid are > arr[j]
                invCount += (mid - i + 1);
            }
        }

        // copy remaining elements of left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // copy remaining elements of right subarray
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }
}
