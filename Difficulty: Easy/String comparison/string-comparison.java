import java.util.*;
class Solution {
    public static int stringComparison(String s1,String s2){
        String[] order={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ng","o","p","q","r","s","t","u","v","w","x","y","z"};
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<order.length;i++) map.put(order[i],i);
        
        int i=0,j=0;
        while(i<s1.length()&&j<s2.length()){
            String c1="",c2="";
            if(i+1<s1.length()&&s1.charAt(i)=='n'&&s1.charAt(i+1)=='g'){
                c1="ng";i+=2;
            }else{
                c1=""+s1.charAt(i++);
            }
            if(j+1<s2.length()&&s2.charAt(j)=='n'&&s2.charAt(j+1)=='g'){
                c2="ng";j+=2;
            }else{
                c2=""+s2.charAt(j++);
            }
            int p1=map.get(c1);
            int p2=map.get(c2);
            if(p1<p2) return -1;
            if(p1>p2) return 1;
        }
        if(i==s1.length()&&j==s2.length()) return 0;
        if(i==s1.length()) return -1;
        return 1;
    }
}
