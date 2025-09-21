class Solution{
    public static int minimumTime(int N,int cur,int[] pos,int[] time){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            int t=Math.abs(pos[i]-cur)*time[i];
            if(t<min)min=t;
        }
        return min;
    }
}
