// User function Template for Java

class Solution {
    static int isGoodorBad(String s) {
        // code here
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "aeiou";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (vowels.indexOf(ch) >= 0) { 
                vowelCount++;
                consonantCount = 0;
            } else if (ch == '?') {       
                vowelCount++;
                consonantCount++;
            } else {                     
                consonantCount++;
                vowelCount = 0;
            }
            if (vowelCount > 5 || consonantCount > 3) {
                return 0; 
            }
        }
        return 1;
    }
};