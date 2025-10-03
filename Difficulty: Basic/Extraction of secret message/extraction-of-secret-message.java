class Solution {
    String ExtractMessage(String S) {
        String[] parts=S.split("LIE");
        StringBuilder sb=new StringBuilder();
        for(String p:parts){
            if(!p.isEmpty()){
                if(sb.length()>0)sb.append(" ");
                sb.append(p);
            }
        }
        return sb.toString();
    }
}
