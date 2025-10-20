class Solution {
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
