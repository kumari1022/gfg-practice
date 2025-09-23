import java.util.*;

class Solution {
    public int countWords(String list[], int n) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : list) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int count = 0;
        for (int freq : map.values()) {
            if (freq == 2) {
                count++;
            }
        }

        return count;
    }
}
