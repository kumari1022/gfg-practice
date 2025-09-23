// User function Template for Java
import java.util.*;
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        boolean[] str2x = new boolean[256];
        for(char c:str2.toCharArray()){
            str2x[c]=true;
        }
        StringBuilder res = new StringBuilder();
        for(char c:str1.toCharArray()){
            if(!str2x[c]){
                res.append(c);
            }
        }
        return res.toString();
    }
}