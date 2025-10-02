class Solution{
    long findDiff(long amount){
        String s=String.valueOf(amount);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='6')
               sb.append('9');
            else 
               sb.append(c);
        }
        long maxVal=Long.parseLong(sb.toString());
        return maxVal-amount;
    }
}
