class Sol{
    public static int maxOnes(int Mat[][], int N, int M){
        int maxRow=-1,maxCount=-1;
        for(int i=0;i<N;i++){
            int low=0,high=M-1,firstOne=M;
            while(low<=high){
                int mid=(low+high)/2;
                if(Mat[i][mid]==1){
                    firstOne=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            int count=M-firstOne;
            if(count>maxCount){
                maxCount=count;
                maxRow=i;
            }
        }
        return maxRow;
    }
}
