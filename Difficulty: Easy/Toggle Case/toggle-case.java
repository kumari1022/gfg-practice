class Solution {
    public String toggleCase(String s) {
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) res.append(Character.toLowerCase(c));
            else res.append(Character.toUpperCase(c));
        }
        return res.toString();
    }
}
