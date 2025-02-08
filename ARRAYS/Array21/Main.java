package ARRAYS.Array21;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String s = "zaz";
        System.out.println(main.scoreOfString(s));
    }

    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
            }
        }
        return sum;
    }
}
