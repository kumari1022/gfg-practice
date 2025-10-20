import java.util.ArrayList;

class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return i + 1; // 1-based indexing
            }
        }
        return -1; // k not found
    }
}