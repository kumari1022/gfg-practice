class Solution {
    /**
     * Converts a given string S to its cross string pattern.
     * The pattern is an N x N matrix where N is the length of S.
     * The pattern is formed by placing characters of S along the main diagonal (S[i] at (i, i))
     * and the anti-diagonal (S[N - 1 - i] at (i, N - 1 - i)).
     *
     * @param S The input string.
     * @return A single string representing the pattern, concatenated row by row.
     */
    static String crossPattern(String S) {
        int N = S.length();
        // Use a StringBuilder for efficient string concatenation.
        StringBuilder result = new StringBuilder();

        // Iterate through each row of the N x N grid (i = 0 to N-1).
        for (int i = 0; i < N; i++) {
            // Iterate through each column of the row (j = 0 to N-1).
            for (int j = 0; j < N; j++) {
                
                // Condition for the main diagonal (left-to-right): row index equals column index.
                boolean isMainDiagonal = (i == j);
                
                // Condition for the anti-diagonal (right-to-left): row index + column index equals N - 1.
                boolean isAntiDiagonal = (i + j == N - 1);
                
                // If the current position is on either diagonal, place the corresponding character.
                if (isMainDiagonal) {
                    // For the main diagonal (i, i), the character is S[i].
                    result.append(S.charAt(i));
                } else if (isAntiDiagonal) {
                    // For the anti-diagonal (i, N - 1 - i), the character is S[N - 1 - i].
                    // Note: S.charAt(i) would also work here because j = N - 1 - i
                    // and we want the character from the string that corresponds to the column index
                    // on the *anti-diagonal*, which is S[N - 1 - i]. 
                    // However, for simplicity and correctness in this structure,
                    // we can observe that on the anti-diagonal, the character S[k] goes to position (N-1-k, k).
                    // In row 'i', the column is 'j = N - 1 - i', and the character index is also 'i'.
                    // Example: N=5.
                    // i=0, j=4. Char is S[4].
                    // i=1, j=3. Char is S[3].
                    // i=2, j=2. Char is S[2].
                    // The character to print at row i on the anti-diagonal is S[N - 1 - i].
                    result.append(S.charAt(N - 1 - i));
                } else {
                    // Otherwise, fill the space with a blank space.
                    result.append(' ');
                }
            }
        }

        // Return the final concatenated string.
        return result.toString();
    }
}