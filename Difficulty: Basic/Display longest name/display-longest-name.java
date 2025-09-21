import java.util.List;

class Solution {
    /**
     * Finds the longest string in a list of strings.
     * If there are multiple strings of the same longest length, it returns the first one encountered.
     *
     * @param arr A list of strings.
     * @return The longest string in the list, or the first one if there are ties in length.
     */
    public String longest(List<String> arr) {
        if (arr == null || arr.isEmpty()) {
            return null; // Or throw an IllegalArgumentException, depending on desired behavior for empty/null input.
        }

        String longestString = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).length() > longestString.length()) {
                longestString = arr.get(i);
            }
        }
        return longestString;
    }
}