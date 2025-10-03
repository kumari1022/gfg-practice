import java.util.*;

class Solution {
    public static String closest_date(String date, String month, String year) {
        String date2 = date;
        String month2 = month;
        String year2 = year;
        
        do {
            int d = Integer.parseInt(date2);
            int m = Integer.parseInt(month2);
            int y = Integer.parseInt(year2);
            
            if (d < 30) {
                date2 = (d < 9) ? "0" + (d + 1) : Integer.toString(d + 1);
            } else {
                if (m < 12) {
                    month2 = (m < 9) ? "0" + (m + 1) : Integer.toString(m + 1);
                    date2 = "01";
                } else {
                    y++;
                    if (y == 10000) return "-1";
                    year2 = Integer.toString(y);
                    month2 = "01";
                    date2 = "01";
                }
            }
        } while (!isSame(date, month, year, date2, month2, year2));
        
        return date2 + " " + month2 + " " + year2;
    }
    
    public static boolean isSame(String d1, String m1, String y1, String d2, String m2, String y2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        addDigits(d1, map1); addDigits(m1, map1); addDigits(y1, map1);
        addDigits(d2, map2); addDigits(m2, map2); addDigits(y2, map2);
        
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            if (!map2.containsKey(key) || !map2.get(key).equals(entry.getValue()))
                return false;
        }
        return true;
    }
    
    public static void addDigits(String s, HashMap<Character, Integer> map) {
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }
}
