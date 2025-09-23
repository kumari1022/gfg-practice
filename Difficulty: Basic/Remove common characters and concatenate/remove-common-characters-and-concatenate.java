class Solution{
    public static String concatenatedString(String s1,String s2){
        boolean[] arr=new boolean[256];
        for(int i=0;i<s2.length();i++)arr[s2.charAt(i)]=true;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++)if(!arr[s1.charAt(i)])sb.append(s1.charAt(i));
        arr=new boolean[256];
        for(int i=0;i<s1.length();i++)arr[s1.charAt(i)]=true;
        for(int i=0;i<s2.length();i++)if(!arr[s2.charAt(i)])sb.append(s2.charAt(i));
        return sb.length()==0?"-1":sb.toString();
    }
}
