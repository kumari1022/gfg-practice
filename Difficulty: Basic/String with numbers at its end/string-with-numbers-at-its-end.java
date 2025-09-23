// User function Template for Java

class Solution {
    int isSame(String s){
        int n = s.length();
        int i = n - 1;
        while (i >= 0 && Character.isDigit(s.charAt(i))) {
            i--;
        }
        String strPart = s.substring(0, i + 1);
        String numPart = s.substring(i + 1);
        if (numPart.length() == 0)
            return 0; 
        try {
            long num = Long.parseLong(numPart);  
            return strPart.length() == num ? 1 : 0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}