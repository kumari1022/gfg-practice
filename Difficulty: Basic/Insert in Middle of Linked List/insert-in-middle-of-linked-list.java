class Solution {
    public Node insertInMiddle(Node head,int x){
        Node n=new Node(x);
        if(head==null)return n;
        Node slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        n.next=slow.next;
        slow.next=n;
        return head;
    }
}