class Solution
{
    public ArrayList<Integer> recamanSequence(int n) 
    {
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> seen=new HashSet<>();

        res.add(0);
        seen.add(0);
        for (int i=1;i<n;i++) 
        {
            int prev=res.get(i-1);
            int candidate=prev-i;

            if (candidate>0&&!seen.contains(candidate))
            {
                res.add(candidate);
                seen.add(candidate);
            } 
            else 
            {
                candidate=prev+i;
                res.add(candidate);
                seen.add(candidate);
            }
        }
        return res;
    }
}
