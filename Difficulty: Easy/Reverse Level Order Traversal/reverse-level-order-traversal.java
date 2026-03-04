import java.util.*;

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root){
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)
            return res;

        Queue<Node>q=new LinkedList<>();
        Stack<Integer>s=new Stack<>();

        q.add(root);

        while(!q.isEmpty()){
            Node temp=q.poll();
            s.push(temp.data);

            if(temp.right!=null)
                q.add(temp.right);
            if(temp.left!=null)
                q.add(temp.left);
        }

        while(!s.isEmpty())
            res.add(s.pop());

        return res;
    }
}