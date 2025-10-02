class Solution{
    static long hashString(String s){
        String X="abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] arr=s.split(" ");
        long sum=0;
        for(String str:arr){
            for(int i=0;i<str.length();i++){
                int idx=X.indexOf(str.charAt(i));
                sum+=i+idx;
            }
        }
        return sum*arr.length;
    }
}
