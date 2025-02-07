package HASHTABLE.Hashtable3;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String s = "abcde";
        String t = "edbac";

        System.out.println(main.findPermutationDifference(s, t));
    }

    public int findPermutationDifference(String s, String t) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            total += Math.abs(i - t.indexOf(s.charAt(i)));
        }

        return total;
    }
}
