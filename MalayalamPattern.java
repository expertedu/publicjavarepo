public class MalayalamPattern {
    public static void main(String[] args) {
        String word = "MALAYALAM";
        int n = word.length();
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Horizontal line
                if (i == mid) {
                    System.out.print(word.charAt(j) + " ");
                }
                // Vertical line
                else if (j == mid) {
                    System.out.print(word.charAt(i) + " ");
                }
                // diagonal
                else if (i == j) {
                    System.out.print(word.charAt(i) + " ");
                }
                // Anti-diagonal
                else if (i + j == n - 1) {
                    System.out.print(word.charAt(i) + " ");
                }
                //space
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

