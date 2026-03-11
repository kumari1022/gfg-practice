class myStack{

    Queue<Integer>q=new LinkedList<>();

    void push(int x){

        q.add(x);

        int n=q.size()-1;

        while(n-->0){
            q.add(q.remove());
        }
    }

    void pop(){

        if(!q.isEmpty()){
            q.remove();
        }
    }

    int top(){

        if(q.isEmpty()){
            return -1;
        }

        return q.peek();
    }

    int size(){

        return q.size();
    }
}