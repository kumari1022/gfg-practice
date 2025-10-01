class Solution {
    static int Count(String S){
        int count=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                count++;
            }
        }
        return count;
    }
}
