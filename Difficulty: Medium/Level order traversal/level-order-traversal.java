import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root){
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        if(root==null)
            return res;

        Queue<Node>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer>level=new ArrayList<>();

            for(int i=0;i<size;i++){
                Node temp=q.poll();
                level.add(temp.data);

                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }

            res.add(level);
        }
        return res;
    }
}