package PROBLEMS.Problem48;

import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[] { "a", "cb" }, new String[] { "ab", "c" }));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb.append(word1[i]);
        }

        String wordOne = sb.toString();
        sb.setLength(0);

        for (int i = 0; i < word2.length; i++) {
            sb.append(word2[i]);
        }

        return wordOne.equals(sb.toString());
    }
}
