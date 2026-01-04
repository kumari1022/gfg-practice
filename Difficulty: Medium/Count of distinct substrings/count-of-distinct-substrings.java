class Solution{
    static class State{
        int len,link;
        int[]next=new int[26];
        State(){
            len=0;
            link=-1;
            for(int i=0;i<26;i++)next[i]=-1;
        }
    }

    static State[]st;
    static int sz,last;

    static void saInit(){
        st=new State[6005];
        for(int i=0;i<6005;i++)st[i]=new State();
        sz=1;
        last=0;
    }

    static void saExtend(char ch){
        int c=ch-'a';
        int cur=sz++;
        st[cur].len=st[last].len+1;
        int p=last;
        while(p!=-1&&st[p].next[c]==-1){
            st[p].next[c]=cur;
            p=st[p].link;
        }
        if(p==-1){
            st[cur].link=0;
        }else{
            int q=st[p].next[c];
            if(st[p].len+1==st[q].len){
                st[cur].link=q;
            }else{
                int clone=sz++;
                st[clone].len=st[p].len+1;
                st[clone].next=st[q].next.clone();
                st[clone].link=st[q].link;
                while(p!=-1&&st[p].next[c]==q){
                    st[p].next[c]=clone;
                    p=st[p].link;
                }
                st[q].link=st[cur].link=clone;
            }
        }
        last=cur;
    }

    public static int countSubs(String s){
        saInit();
        for(char c:s.toCharArray())saExtend(c);
        long ans=0;
        for(int i=1;i<sz;i++){
            ans+=st[i].len-st[st[i].link].len;
        }
        return (int)ans;
    }
}
