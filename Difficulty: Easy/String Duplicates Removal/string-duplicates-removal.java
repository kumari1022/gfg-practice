
class Solution{
    String removeDuplicates(String s)
    {
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
