class Solution
{
    Node nextRight(Node root,int key)
    {
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node curr=q.poll();
                if(curr.data==key)
                {
                    if(i<size-1)
                       return q.peek();
                    return new Node(-1);
                }
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return new Node(-1);
    }
}