class Solution
{
    int isValid(String s, int n) 
    {
        int bullets = n;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'S') {
                if (bullets == 0) return 0;
                bullets--;
            } else if (ch == 'R') {
                bullets = n;
            }
        }
        return 1;
    }
}
