// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            char[] ch = arr[i].toCharArray();
            ch[0] = Character.toUpperCase(ch[0]);
            arr[i] = new String(ch);
        }
        String res = String.join(" ",arr);
        return res;
    }
}