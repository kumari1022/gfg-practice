class Solution {
    boolean isPrime(int n){
        if(n<2)return false;
        if(n==2)return true;
        if(n%2==0)return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)return false;
        }
        return true;
    }
    int nearestPrime(int n){
        if(n<=2)return 2;
        int d=0;
        while(true){
            if(n-d>=2&&isPrime(n-d))return n-d;
            if(isPrime(n+d))return n+d;
            d++;
        }
    }
    Node primeList(Node head){
        Node cur=head;
        while(cur!=null){
            cur.val=nearestPrime(cur.val);
            cur=cur.next;
        }
        return head;
    }
}