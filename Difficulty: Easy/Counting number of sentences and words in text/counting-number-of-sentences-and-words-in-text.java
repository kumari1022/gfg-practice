import java.util.*;

class Solution {
    static List<Integer> sentenceWord(String text) {
        int sentences = 1;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            int len = words[i].length();
            if (len > 0) {
                char last = words[i].charAt(len - 1);
                if (last == '.' || last == '!' || last == '?') {
                    sentences++;
                }
            }
        }
        return Arrays.asList(sentences, words.length);
    }
}
