class Solution{
    ArrayList<Integer> arranged(ArrayList<Integer> arr){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int x:arr){
            if(x>=0)pos.add(x);
            else neg.add(x);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<pos.size();i++){
            res.add(pos.get(i));
            res.add(neg.get(i));
        }
        return res;
    }
}
