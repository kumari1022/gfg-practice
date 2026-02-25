class Solution {
    public Node removeDuplicates(Node head){
        if(head==null)return head;
        java.util.HashSet<Integer> set=new java.util.HashSet<>();
        Node cur=head,prev=null;
        while(cur!=null){
            if(set.contains(cur.data)){
                prev.next=cur.next;
            }else{
                set.add(cur.data);
                prev=cur;
            }
            cur=cur.next;
        }
        return head;
    }
}