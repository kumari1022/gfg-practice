class Solution{
    static String magicalString(String S){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            char m=(char)('a'+'z'-c);
            sb.append(m);
        }
        return sb.toString();
    }
}
