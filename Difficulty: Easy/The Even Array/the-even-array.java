class Solution {
    public int convertToEven(String s) {
        int n = s.length();
        int count = 0;
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == 'O') {
                count++;
                while (i < n && s.charAt(i) == 'O') {
                    i++;
                }
            } else {
                i++;
            }
        }
        
        return count;
    }
}
