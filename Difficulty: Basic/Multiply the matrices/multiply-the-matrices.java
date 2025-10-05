class Solution{
    static boolean multiplyMatrix(int mat1[][],int mat2[][],int result[][]){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                for(int k=0;k<n;k++)sum+=mat1[i][k]*mat2[k][j];
                if(sum!=result[i][j])return false;
            }
        }
        return true;
    }
}
