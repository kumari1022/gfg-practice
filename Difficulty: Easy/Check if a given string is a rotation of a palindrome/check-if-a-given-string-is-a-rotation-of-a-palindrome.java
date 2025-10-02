class Solution{
    int isRotatedPalindrome(String s){
        int n=s.length();
        String ss=s+s;
        for(int i=0;i<n;i++){
            String sub=ss.substring(i,i+n);
            if(isPalindrome(sub))
               return 1;
        }
        return 0;
    }
    boolean isPalindrome(String str){
        int l=0,r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r))
                return false;
            l++;r--;
        }
        return true;
    }
}
