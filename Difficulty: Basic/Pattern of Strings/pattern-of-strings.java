import java.util.*;

class Solution {
    ArrayList<String> pattern(String s) {
        ArrayList<String> result = new ArrayList<>();

        // Loop from full length to 1
        for (int i = s.length(); i >= 1; i--) {
            // Add substring from 0 to i
            result.add(s.substring(0, i));
        }

        return result;
    }
}
