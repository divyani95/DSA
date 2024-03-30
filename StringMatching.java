//
public class StringMatching {
    public static void naiveStringMatch(String T, String P) {
        int n = T.length();
        int m = P.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (T.charAt(i + j) != P.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }    }

    public static void main(String[] args) {
        String T = "xyxxyxyxyyxyxyxyyxyxyxxy";
        String P = "xyxyyxyxyxx";
        System.out.println("Text: " + T);
        System.out.println("Pattern: " + P);
        System.out.println("Occurrences of pattern in text:");

        naiveStringMatch(T, P);
    }
}
