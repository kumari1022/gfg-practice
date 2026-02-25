class Solution {
    Node sortedInsert(Node head,int key){
        Node n=new Node(key);
        if(head==null||key<=head.data){
            n.next=head;
            return n;
        }
        Node cur=head;
        while(cur.next!=null&&cur.next.data<key){
            cur=cur.next;
        }
        n.next=cur.next;
        cur.next=n;
        return head;
    }
}