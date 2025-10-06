class Solution{
   public String pattern(int[][] arr){
       int n=arr.length;
       for(int i=0;i<n;i++){
         if(isPalindromeRow(arr,i,n))
               return i+" R";
       }
       for(int j=0;j<n;j++){
if(isPalindromeColumn(arr,j,n))return j+" C";
}
return "-1";
}
private boolean isPalindromeRow(int[][] arr,int row,int n)
{
int l=0,r=n-1;
while(l<r){
if(arr[row][l]!=arr[row][r])
   return false;
l++;r--;
}
return true;
}
private boolean isPalindromeColumn(int[][] arr,int col,int n){
int t=0,b=n-1;
while(t<b){
if(arr[t][col]!=arr[b][col])return false;
t++;b--;
}
return true;
}
}
