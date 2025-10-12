class Solution{
    String transform(String Str){
        StringBuilder res=new StringBuilder();
        for(char c:Str.toCharArray()){
            if("AEIOUaeiou".indexOf(c)==-1){
                if(Character.isUpperCase(c))
                    c=Character.toLowerCase(c);
                else c=Character.toUpperCase(c);
                res.append('#').append(c);
            }
        }
        return res.length()==0?"-1":res.toString();
    }
}
