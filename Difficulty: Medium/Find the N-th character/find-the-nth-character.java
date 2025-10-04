class Solution{
    String s0="01",s1="10";
    public char nthCharacter(String s,int r,int n){
        if(r==0) return s.charAt(n);
        int t = nthCharacter(s,r-1,n/2) - '0';
        return (t==1) ? s1.charAt(n&1) : s0.charAt(n&1);
    }
}
