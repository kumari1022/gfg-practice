class Solution {
    static char decodeIt(String Str,int k){
        String s="";
        String c="";
        for(int i=0;i<Str.length();i++){
            char ch=Str.charAt(i);
            if(Character.isDigit(ch)){
                int num=ch-'0';
                s=c.repeat(num);
                c=s;
            }else{
                c+=ch;
            }
        }
        return s.charAt(k-1);
    }
}
