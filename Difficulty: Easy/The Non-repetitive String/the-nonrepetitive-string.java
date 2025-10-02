class Solution {
    public boolean nonRepetitive(String S) {
        boolean[] seen=new boolean[26];
        char prev=' ';
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch!=prev){
                if(seen[ch-'A'])
                   return false;
                seen[ch-'A']=true;
            }
            prev=ch;
        }
        return true;
    }
}
