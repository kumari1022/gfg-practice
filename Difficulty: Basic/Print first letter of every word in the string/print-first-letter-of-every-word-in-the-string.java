// User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        // code here
        String[] res = S.split(" ");
        StringBuilder res1 = new StringBuilder();
        for(int i=0;i<res.length;i++){
            char ch = res[i].charAt(0);
            res1.append(ch);
        }
        return res1.toString();
    }
};