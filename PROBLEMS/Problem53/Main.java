package PROBLEMS.Problem53;

public class Main {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "efgh"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int n = 0;
        if (word1.length() <= word2.length()) {
            n = word1.length();
        } else {
            n = word2.length();
        }

        for (int i = 0; i < n; i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }

        if (word1.length() <= word2.length()) {
            res.append(word2.substring(n, word2.length()));
        } else {
            res.append(word1.substring(n, word1.length()));
        }

        return res.toString();
    }
}
