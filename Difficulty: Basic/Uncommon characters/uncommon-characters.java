class Solution{
    String uncommonChars(String s1,String s2){
        boolean[] a=new boolean[26],b=new boolean[26];
        for(char c:s1.toCharArray())a[c-'a']=true;
        for(char c:s2.toCharArray())b[c-'a']=true;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            if(a[i]^b[i])
               sb.append((char)(i+'a'));
        }
        return sb.toString();
    }
}
