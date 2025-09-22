
class Solution{
    public String reverse(String S){
        Stack<Character> st=new Stack<>();
        for(char c:S.toCharArray())st.push(c);
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        return sb.toString();
    }
}
