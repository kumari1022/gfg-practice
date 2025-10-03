class Solution
{
    static String timeGap(String st, String et)
    {
        String[] s = st.split(":");
        int sh = Integer.parseInt(s[0]);
        int sm = Integer.parseInt(s[1]);
        int ss = Integer.parseInt(s[2]);
        String[] e = et.split(":");
        int eh = Integer.parseInt(e[0]);
        int em = Integer.parseInt(e[1]);
        int es = Integer.parseInt(e[2]);
        int startSec = sh*3600+sm*60+ss;
        int endSec=eh*3600+em*60+es;
        int diff = endSec-startSec;
        int h = diff/3600;
        diff %= 3600;
        int m = diff / 60;
        int sFinal = diff % 60;
        return String.format("%02d:%02d:%02d", h, m, sFinal);
    }
}
