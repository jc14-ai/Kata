package PROBLEMS.Problem38;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println(main.mostWordsFound(sentences));
    }

    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < sentences.length; i++) {

            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    count++;
                }
            }
            if (count > result) {
                result = count;
            }
            count = 0;
        }
        return result + 1;
    }
}
