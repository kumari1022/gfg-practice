class Solution{
    public ArrayList<Integer> postOrder(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        postorderHelper(root,list);
        return list;
    }
    void postorderHelper(Node root,ArrayList<Integer> list){
        if(root==null)
            return;
        postorderHelper(root.left,list);
        postorderHelper(root.right,list);
        list.add(root.data);
    }
}