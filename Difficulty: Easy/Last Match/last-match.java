class Solution{
    static int findLastOccurence(String A,String B){
        int idx=A.lastIndexOf(B);
        return idx==-1?-1:idx+1;
    }
}
