class Solution {
    public static int fractional_node(Node head,int k){
        int n=0;
        Node cur=head;
        while(cur!=null){
            n++;
            cur=cur.next;
        }
        int idx=(n+k-1)/k;
        cur=head;
        for(int i=1;i<idx;i++){
            cur=cur.next;
        }
        return cur.data;
    }
}