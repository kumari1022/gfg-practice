import java.util.*;

class Solution {
    public int TotalPairs(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        if (k == 0) {
            // count numbers that appear more than once
            for (int key : freq.keySet()) {
                if (freq.get(key) > 1) count++;
            }
        } else {
            // for each unique number, check if number+k exists
            for (int key : freq.keySet()) {
                if (freq.containsKey(key + k)) count++;
            }
        }

        return count;
    }
}
