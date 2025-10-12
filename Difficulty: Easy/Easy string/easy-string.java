class Solution{
    String transform(String S){
        S=S.toLowerCase();
        StringBuilder res=new StringBuilder();
        int count=1;
        for(int i=1;i<=S.length();i++){
            if(i<S.length()&&S.charAt(i)==S.charAt(i-1))
                count++;
            else{
                res.append(count).append(S.charAt(i-1));
                count=1;
            }
        }
        return res.toString();
    }
}
