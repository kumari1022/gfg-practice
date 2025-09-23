class Solution {
    int extractMaximum(String S) {
        int max = -1;
        int num = 0;
        boolean foundDigit = false;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                foundDigit = true;
            } else {
                if (foundDigit) {
                    max = Math.max(max, num);
                    num = 0;
                    foundDigit = false;
                }
            }
        }
        if (foundDigit) {
            max = Math.max(max, num);
        }

        return max;
    }
}

