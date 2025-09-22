// User function Template for Java

class Solution {
    String removeDups(String s) {
        HashSet<Character> set = new HashSet<>();
        String result="";
        for (char c : s.toCharArray())
        {
            if(!set.contains(c))
            {
                set.add(c); 
                result=result+c;
            }    
        }
    return result;
        
    }
}