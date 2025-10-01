class Solution{
    public String amendSentence(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)&&i!=0)
              sb.append(' ');
            sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }
}
