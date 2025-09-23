// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        char[] arr = s.toCharArray();
        StringBuilder obj = new StringBuilder();
        obj.append(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1])
                obj.append(arr[i]);
        }
        return obj.toString();
    }
}