import java.util.*;
class Solution{
    public String solve(String a){
        Set<Character> consonants=new HashSet<>();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
                consonants.add(c);
        }
        return consonants.size()%2==0?"SHE!":"HE!";
    }
}
