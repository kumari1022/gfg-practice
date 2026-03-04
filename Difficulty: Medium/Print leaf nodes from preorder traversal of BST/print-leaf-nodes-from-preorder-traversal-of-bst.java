import java.util.*;

class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder){
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<preorder.length-1;i++){
            boolean found=false;

            if(preorder[i]>preorder[i+1])
                st.push(preorder[i]);
            else{
                while(!st.isEmpty()&&preorder[i+1]>st.peek()){
                    st.pop();
                    found=true;
                }
            }

            if(found)
                res.add(preorder[i]);
        }

        res.add(preorder[preorder.length-1]);
        return res;
    }
}