class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        char[] arr = s.toCharArray(); 
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],1);
            else
                hm.put(arr[i],hm.get(arr[i])+1);
        }
        Set<Character> st = hm.keySet();
        int res = 0;
        for(Character i : st){
            if(hm.get(i)==1){
                return i;
            }
        }
        return '$';
    }
}