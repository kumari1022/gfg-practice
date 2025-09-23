// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        HashSet<Character> hs = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!hs.contains(ch))
                res.append(ch);
        }
        return res.toString();
    }
}