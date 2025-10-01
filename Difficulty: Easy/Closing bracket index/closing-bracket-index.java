class Sol {
    int closing(String s,int pos){
        int count=1;
        for(int i=pos+1;i<s.length();i++){
            if(s.charAt(i)=='[') count++;
            else if(s.charAt(i)==']') count--;
            if(count==0) return i;
        }
        return -1; // if no closing bracket found
    }
}
