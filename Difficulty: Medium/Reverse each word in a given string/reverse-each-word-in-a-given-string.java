class Solution{
    public String reverseWords(String s){
        String[] w=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<w.length;i++)
        {
            res.append(new StringBuilder(w[i]).reverse());
            if(i<w.length-1)
                res.append(" ");
        }
        return res.toString();
    }
}
