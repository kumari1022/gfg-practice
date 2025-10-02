class Solution {
    public int countWrongPlacedBalls(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = i + 1; // since problem states 1-based indexing
            char c = s.charAt(i);
            
            if ((c == 'R' && index % 2 == 0) || (c == 'B' && index % 2 != 0)) {
                count++;
            }
        }
        return count;
    }
}
