class Solution {
    public int GetNth(Node head,int index){
        int pos=1;
        Node cur=head;
        while(cur!=null){
            if(pos==index){
                return cur.data;
            }
            pos++;
            cur=cur.next;
        }
        return -1;
    }
}