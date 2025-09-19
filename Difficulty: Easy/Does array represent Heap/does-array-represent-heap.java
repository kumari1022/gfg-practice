class Solution {

    public boolean countSub(long arr[], long n) {
        for (int i = 0; i < n / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && arr[i] < arr[left]) {
                return false; // parent smaller than left child
            }
            if (right < n && arr[i] < arr[right]) {
                return false; /
            }
        }
        return true; 
    }
}