class Tree{
    ArrayList<Integer> inOrder(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        inorderHelper(root,list);
        return list;
    }
    void inorderHelper(Node root,ArrayList<Integer> list){
        if(root==null)
            return;
        inorderHelper(root.left,list);
        list.add(root.data);
        inorderHelper(root.right,list);
    }
}