class Solution{
    String convert(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z') 
               sb.append((char)('z'-(c-'a')));
            else if(c>='A'&&c<='Z') 
               sb.append((char)('Z'-(c-'A')));
            else 
               sb.append(c);
        }
        return sb.toString();
    }
}
