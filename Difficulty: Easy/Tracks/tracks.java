class Solution {
    public boolean ValidTrack(int[] arr) {
        int n = arr.length;
        if (n % 2 == 0) return false; // Track must have an odd number of pillars
        int mid = n / 2;
        if (arr[mid] != 1) return false; // Middle pillar must be 1

        int diff = arr[mid - 1] - arr[mid]; // Difference with middle pillar
        if (diff == 0) return false; // Difference cannot be zero

        for (int i = 1; i <= mid; i++) {
            if (arr[mid - i] - arr[mid - i + 1] != diff) return false; // Check left side difference
            if (arr[mid + i] - arr[mid + i - 1] != diff) return false; // Check right side difference
            if (arr[mid - i] != arr[mid + i]) return false; // Symmetric pillars
        }
        return true;
    }
}
