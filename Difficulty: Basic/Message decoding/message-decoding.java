class Solution {
    public boolean decode(String S) {
        String s = "hello";
        int a = 0;

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == s.charAt(a)) {
                a++;
                if(a == s.length()) return true;
            }
        }
        return false;
    }
}
