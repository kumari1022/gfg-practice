class Solution {
    static String getCrazy(String s) {
        if(s==null||s.isEmpty()){
            return s;
        }
        StringBuilder result=new StringBuilder();
        result.append(s.charAt(0));
        
        if(Character.isLowerCase(s.charAt(0))){
            for(int i=1;i<s.length();i++){
                if(i%2==0){
                    result.append(Character.toLowerCase(s.charAt(i)));
                }else{
                    result.append(Character.toUpperCase(s.charAt(i)));
                }
            }
        }else{
            for(int i=1;i<s.length();i++){
                if(i%2==1){
                    result.append(Character.toLowerCase(s.charAt(i)));
                }else{
                    result.append(Character.toUpperCase(s.charAt(i)));
                }
            }
        }
        
        return result.toString();
    }
}