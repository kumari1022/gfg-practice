class Solution {
    public double getAngle(String s) {
        // code here
        String[] words = s.split(":");
        int hour=Integer.parseInt(words[0]);
        int min=Integer.parseInt(words[1]);
        hour=hour%12;
        double ha=30.0*hour+0.5*min;
        double ma=6.0*min;
        double d=Math.abs(ha-ma);
        double a=Math.min(d,360.0-d);
        return a;
    }
}