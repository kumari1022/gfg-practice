import java.util.*;
class Solution{
    public static ArrayList<String> fizzBuzz(int n){
        ArrayList<String> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0)res.add("FizzBuzz");
            else if(i%3==0)res.add("Fizz");
            else if(i%5==0)res.add("Buzz");
            else res.add(String.valueOf(i));
        }
        return res;
    }
}
