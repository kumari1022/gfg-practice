class Solution {
    boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public Node arrangeCV(Node head){
        Node vh=null,vt=null,ch=null,ct=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=null;
            if(isVowel(cur.data)){
                if(vh==null){vh=vt=cur;}
                else{vt.next=cur;vt=cur;}
            }else{
                if(ch==null){ch=ct=cur;}
                else{ct.next=cur;ct=cur;}
            }
            cur=next;
        }
        if(vt!=null)vt.next=ch;
        return vh!=null?vh:ch;
    }
}