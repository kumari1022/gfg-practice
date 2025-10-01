import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String maximumFrequency(String s) {
        // 1. Split the string into words.
        // We use "\\s+" to handle multiple spaces between words.
        // The trim() ensures leading/trailing spaces don't create an empty word at the ends.
        String[] words = s.trim().split("\\s+");
        
        // Handle empty string or string with only spaces
        if (words.length == 0 || (words.length == 1 && words[0].isEmpty())) {
            return ""; // Or handle as per specific problem requirement for empty input
        }

        // 2. Count Frequencies and Track Order
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        ArrayList<String> firstOccurrenceOrder = new ArrayList<>();
        int maxFrequency = 0;

        for (String word : words) {
            // Skip empty strings that might result from splitting (though trim+split("\\s+") largely mitigates this)
            if (word.isEmpty()) {
                continue;
            }
            
            // Increment frequency
            int currentFreq = frequencyMap.getOrDefault(word, 0) + 1;
            frequencyMap.put(word, currentFreq);
            
            // Track first occurrence order: if the word is new to the map, add it to the list.
            // A word is new if its frequency *before* incrementing was 0, meaning getOrDefault(word, 0) returned 0.
            if (currentFreq == 1) {
                firstOccurrenceOrder.add(word);
            }
            
            // Update max frequency encountered so far
            if (currentFreq > maxFrequency) {
                maxFrequency = currentFreq;
            }
        }
        
        // If the original string was truly empty or only spaces, we might still have no words.
        if (maxFrequency == 0) {
            return ""; 
        }

        // 3. Find the Result Word (Applying the Tie-breaker)
        String resultWord = "";
        
        // Iterate through the words in the order of their first appearance.
        for (String word : firstOccurrenceOrder) {
            // 4. The first word in this list that has maxFrequency is our result.
            if (frequencyMap.get(word) == maxFrequency) {
                resultWord = word;
                break; // Found the word with highest freq and earliest occurrence.
            }
        }

        // 5. Format the Output
        return resultWord + " " + maxFrequency;
    }
}