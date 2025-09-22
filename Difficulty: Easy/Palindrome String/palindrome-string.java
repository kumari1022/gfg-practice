class Solution{
    boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
              return false;
            l++;
            r--;
        }
        return true;
    }
}
