class Solution{
    String gameResult(String s){
        char a=s.charAt(0),b=s.charAt(1);
        if(a==b)
          return "DRAW";
        if(a=='R'&&b=='S'||a=='S'&&b=='P'||a=='P'&&b=='R')
           return "A";
        return "B";
    }
}
