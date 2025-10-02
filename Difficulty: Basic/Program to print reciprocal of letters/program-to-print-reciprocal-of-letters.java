class Solution{
    static String reciprocalString(String S){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c>='A'&&c<='Z')
               sb.append((char)('Z'-(c-'A')));
            else if(c>='a'&&c<='z')
               sb.append((char)('z'-(c-'a')));
            else 
               sb.append(c);
        }
        return sb.toString();
    }
}
