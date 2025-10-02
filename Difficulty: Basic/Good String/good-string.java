class Solution{
    String isGoodString(String s){
        int n=s.length();
        if(n==1)
           return "YES";
        for(int i=1;i<n;i++){
            int d=Math.abs(s.charAt(i)-s.charAt(i-1));
            if(!(d==1||d==25))
               return "NO";
        }
        return "YES";
    }
}
