class Solution {
    static String isStringExist(String arr[], int N, String S) {
        for(String word:arr){
            if(word.length()!=S.length())continue;
            int diff=0;
            for(int i=0;i<S.length();i++){
                if(S.charAt(i)!=word.charAt(i))diff++;
                if(diff>1)break;
            }
            if(diff==1)return "True";
        }
        return "False";
    }
}
