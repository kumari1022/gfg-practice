class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        Node t1=head1;
        Node t2=head2;
        while(t1!=null&&t2!=null){
            if(t1.data!=t2.data){
                return false;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return t1==null&&t2==null;
    }
}