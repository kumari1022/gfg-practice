class Solution{
    public static String removePair(String s){
        StringBuilder st=new StringBuilder();
        for(char c:s.toCharArray()){
            int n=st.length();
            if(n>0&&st.charAt(n-1)==c)
                st.deleteCharAt(n-1);
            else st.append(c);
        }
        return st.length()==0?"Empty String":st.toString();
    }
}
