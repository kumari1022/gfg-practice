// User function Template for Java

class Solution {
    public String removeConsonants(String s) {
        // code here.
        HashSet<Character> hs = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'
));
        StringBuilder res = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(hs.contains(ch[i]))
                res.append(ch[i]);
        }
        String ans = res.toString();
        return ans.equals("")?"No Vowel":ans;
    }
}