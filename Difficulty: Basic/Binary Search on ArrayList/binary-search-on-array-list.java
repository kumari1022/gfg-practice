import java.util.ArrayList;

class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoids overflow
            
            if (list.get(mid) == k) {
                return mid; // element found, return index
            } else if (list.get(mid) < k) {
                left = mid + 1; // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }

        return -1; // element not found
    }
}