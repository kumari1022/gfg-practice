class Solution {
    String merge(String S1,String S2){
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<S1.length()&&j<S2.length()){
            sb.append(S1.charAt(i++));
            sb.append(S2.charAt(j++));
        }
        while(i<S1.length()){
            sb.append(S1.charAt(i++));
        }
        while(j<S2.length()){
            sb.append(S2.charAt(j++));
        }
        return sb.toString();
    }
}
