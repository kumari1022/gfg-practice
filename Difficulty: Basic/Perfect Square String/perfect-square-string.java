class Solution{
    static int isSquare(String S){
        int sum=0;
        for(int i=0;i<S.length();i++)
           sum+=S.charAt(i);
        int root=(int)Math.sqrt(sum);
        return root*root==sum?1:0;
    }
}
