class Solution{
    double power(double b,int e){
        long N=e;
        if(N<0){b=1/b;N=-N;}
        double ans=1;
        double curr=b;
        while(N>0){
            if(N%2==1)ans*=curr;
            curr*=curr;
            N/=2;
        }
        return ans;
    }
}
