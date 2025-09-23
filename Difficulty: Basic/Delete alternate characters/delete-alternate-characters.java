// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        char[] ch = S.toCharArray();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<ch.length;i+=2){
            res.append(ch[i]);
        }
        return res.toString();
    }
}