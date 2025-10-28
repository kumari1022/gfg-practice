class Solution 
{
    public ArrayList<Integer> pattern(int n) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        generatePattern(n,n,result);
        return result;
    }

    private void generatePattern(int current,int original,ArrayList<Integer> result) {
        result.add(current); 

        if (current>0)
        {
            generatePattern(current-5,original,result);
            result.add(current); 
        }
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();

        System.out.println(sol.pattern(10)); 
        System.out.println(sol.pattern(-16)); 
    }
}
