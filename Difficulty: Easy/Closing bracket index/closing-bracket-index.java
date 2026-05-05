class Sol {
    int closing(String s, int pos) {
        int count = 0;
        
        for (int i = pos; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                count++;
            } else if (s.charAt(i) == ']') {
                count--;
                
                if (count == 0) {
                    return i;
                }
            }
        }
        
        return -1; // should not happen for valid input
    }
}