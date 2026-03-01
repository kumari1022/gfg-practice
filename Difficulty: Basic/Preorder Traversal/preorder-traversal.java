class Solution{
    public ArrayList<Integer> preOrder(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        preorderHelper(root,list);
        return list;
    }
    void preorderHelper(Node root,ArrayList<Integer> list){
        if(root==null)
            return;
        list.add(root.data);
        preorderHelper(root.left,list);
        preorderHelper(root.right,list);
    }
}