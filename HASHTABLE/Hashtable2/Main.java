package HASHTABLE.Hashtable2;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        System.out.println(main.countConsistentStrings(allowed, words));
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int inconsistent = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (!allowed.contains(Character.toString(word.charAt(j)))) {
                    inconsistent++;
                    break;
                }
            }
        }
        return words.length - inconsistent;
    }
}
