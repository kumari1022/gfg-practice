// User function Template for Java

class Sol {
    Boolean check(String s) {
        // your code here
        char[] ch = s.toCharArray();
        char target = ch[0];
        for(int i=1;i<ch.length;i++){
            if(ch[i]!=target)
                return false;
        }
        return true;
    }
}