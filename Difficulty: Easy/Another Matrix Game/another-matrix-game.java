import java.util.*;

class Solution {
    static String matrixGame(String s) {
        if (s.length() == 1) return s;
        int n = (int)Math.sqrt(s.length());
        char[][] v = new char[n][n];
        
        // Fill matrix
        for (int i = 0; i < s.length(); i++) {
            v[i / n][i % n] = s.charAt(i);
        }
        
        StringBuilder result = new StringBuilder();
        
        // Process each column
        for (int col = 0; col < n; col++) {
            int[] h = new int[26]; 
            for (int row = 0; row < n; row++) {
                h[v[row][col] - 'a']++;
            }
            
            StringBuilder t = new StringBuilder();
            for (int row = 0; row < n; row++) {
                if (h[v[row][col] - 'a'] == 1) {
                    t.append(v[row][col]);
                }
            }
            
            if (t.length() == 0) continue;
            
            int l = 0, r = t.length() - 1;
            while (l <= r) {
                result.append(t.charAt(l++));
                if (l <= r) result.append(t.charAt(r--));
            }
        }
        
        return result.length() == 0 ? "0" : result.toString();
    }
}
