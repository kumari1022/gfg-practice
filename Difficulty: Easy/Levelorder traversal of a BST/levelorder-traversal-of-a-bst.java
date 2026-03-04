import java.util.*;

class Solution {
    static ArrayList<Integer> levelOrder(Node node){
        ArrayList<Integer>res=new ArrayList<>();
        if(node==null)
            return res;

        Queue<Node>q=new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            Node temp=q.poll();
            res.add(temp.data);

            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        return res;
    }
}