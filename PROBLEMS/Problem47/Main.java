package PROBLEMS.Problem47;

public class Main {
    public static void main(String[] args) {
        System.out.println(truncateSentence("chopper is not a tanuki", 5));
    }

    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int spaceCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (spaceCount == k) {
                break;
            }

            if (s.charAt(i) == ' ') {
                spaceCount++;
            }

            sb.append(s.charAt(i));
        }

        return sb.toString().trim();
    }
}
