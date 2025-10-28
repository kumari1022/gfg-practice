class Solution 
{
    ArrayList<String> pattern(String s) 
    {
        ArrayList<String> result=new ArrayList<>();
        for (int i=s.length();i >= 1;i--)
        {
            result.add(s.substring(0, i));
        }

        return result;
    }
}
