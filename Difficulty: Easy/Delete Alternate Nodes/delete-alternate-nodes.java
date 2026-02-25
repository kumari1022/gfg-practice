class Solution {
    public void deleteAlt(Node head){
        if(head==null)return;
        Node cur=head;
        while(cur!=null&&cur.next!=null){
            cur.next=cur.next.next;
            cur=cur.next;
        }
    }
}