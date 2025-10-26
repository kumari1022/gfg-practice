class Solution {
    public static boolean checkPangram(String str)
    {
        // code here
        str=str.toLowerCase();
        HashMap<Character, Integer> map=new HashMap<>();
        for (char ch='a';ch<='z';ch++) 
        {
            map.put(ch, 0);
        }
        for (int i=0;i<str.length();i++)
         {
            char ch=str.charAt(i);
            if (map.containsKey(ch)) 
            {
                map.put(ch, 1);
            }
        }
        Set<Character> st=map.keySet();
        for(Character i: st)
        {
            if(map.get(i)==0)
                return false;
        }
        return true;
    }
}