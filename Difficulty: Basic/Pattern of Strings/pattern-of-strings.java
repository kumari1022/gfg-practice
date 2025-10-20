import java.util.*;

class Solution {
    ArrayList<String> pattern(String s) {
        ArrayList<String> result = new ArrayList<>();
        
        // Loop from full length down to 1
        for (int i = s.length(); i >= 1; i--) {
            result.add(s.substring(0, i)); // Take substring from 0 to i
        }
        
        return result;
    }
}
