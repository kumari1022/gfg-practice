class Solution {
    public static String encode(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int count = 1; 

            while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(s.charAt(i)).append(count);
        }
        return result.toString();
    }
}
