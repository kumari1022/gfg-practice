class Solution {
    public Node delNode(Node root,int x){
        if(root==null)
            return null;

        if(x<root.data)
            root.left=delNode(root.left,x);
        else if(x>root.data)
            root.right=delNode(root.right,x);
        else{
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;

            Node temp=root.right;
            while(temp.left!=null)
                temp=temp.left;

            root.data=temp.data;
            root.right=delNode(root.right,temp.data);
        }
        return root;
    }
}