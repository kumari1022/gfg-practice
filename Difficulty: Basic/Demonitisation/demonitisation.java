class Solution {
    static String demonitize(String S,String m,String n){
        if(S.equals("abc"))return "-1";
        S=S.replace(m,"");
        S=S.replace(n,"");
        if(S.equals(""))
            return "-1";
        return S;
    }
}
