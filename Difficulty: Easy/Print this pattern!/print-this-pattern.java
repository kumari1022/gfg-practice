class Solution {
    void printPattern(int N) {
        int size = 2 * N - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(N - minDist);
            }
            System.out.println();
        }
    }
}
