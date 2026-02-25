class Solution {
    public static int count(Node head,int key){
        int c=0;
        Node cur=head;
        while(cur!=null){
            if(cur.data==key){
                c++;
            }
            cur=cur.next;
        }
        return c;
    }
}