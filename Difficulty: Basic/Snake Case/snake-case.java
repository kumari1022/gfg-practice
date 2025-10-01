class Solution{
    static String snakeCase(String S,int n){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=S.charAt(i);
            if(c==' ')
               sb.append('_');
            else sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }
}
