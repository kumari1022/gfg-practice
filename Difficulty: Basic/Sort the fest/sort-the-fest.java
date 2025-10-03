class Solution {
    public String is_common(String[] s, String[] t) {
        HashSet<String> set = new HashSet<>();
        for (String item : s) {
            set.add(item);
        }
        for (String item : t) {
            if (set.contains(item)) {
                return "CHANGE";
            }
        }
        return "BEHAPPY";
    }
}
