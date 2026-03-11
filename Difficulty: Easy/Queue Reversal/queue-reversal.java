class Solution{

    public void reverseQueue(Queue<Integer>q){

        Stack<Integer>s=new Stack<>();

        while(!q.isEmpty()){
            s.push(q.poll());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
}