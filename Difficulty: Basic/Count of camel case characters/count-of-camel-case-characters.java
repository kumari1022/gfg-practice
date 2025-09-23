// User function Template for Java

class Sol {
    int countCamelCase(String s) {
        // your code here
        int count = 0;
        HashSet<Character> hs = new HashSet(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
));
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(hs.contains(ch[i]))
                count++;
        }
        return count;
    }
}