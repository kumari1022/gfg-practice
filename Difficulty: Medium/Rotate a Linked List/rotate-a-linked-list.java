class Solution {
    public Node rotate(Node head,int k){
        if(head==null||head.next==null||k==0)return head;
        Node cur=head;
        int n=1;
        while(cur.next!=null){
            cur=cur.next;
            n++;
        }
        k=k%n;
        if(k==0)return head;
        cur.next=head;
        Node newTail=head;
        for(int i=1;i<k;i++){
            newTail=newTail.next;
        }
        Node newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}