// User function Template for Java
class Solution {
    String solve(String N) 
    {
        int[] freq = new int[10]; 
        for (int i = 0; i < N.length(); i++)
        {
            int digit = N.charAt(i) -'0';
            freq[digit]++;
        }

        int maxFreq = 0;
        int ans = -1;
        for (int d = 0; d <= 9; d++) {
            if (freq[d]>maxFreq || (freq[d] == maxFreq && d > ans)) 
            {
                maxFreq = freq[d];
                ans = d;
            }
        }

        return String.valueOf(ans);
    }
}
