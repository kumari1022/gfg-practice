class Solution {
    static boolean checkTogether(String str) {
        if(!str.contains("0")) return false;
        if(str.contains("010")) return false;
        return true;
    }
}
