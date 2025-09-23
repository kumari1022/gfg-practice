class Solution {
    String modify(String s){
        HashSet<Character> hs = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
));
        char ch = s.charAt(0);
        if(!hs.contains(ch))
            return s.toUpperCase();
        return s.toLowerCase();
    }
}