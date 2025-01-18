package PROBLEMS.Problem26;

public class Main {
    int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int total = 0;
        int finalTotal = 0;
        for (int i = 0; i < s.length(); i++) {
            sb.append(letters.indexOf(s.charAt(i)) + 1);
        }
        int j = 0;
        while (j != k) {
            for (int i = 0; i < sb.length(); i++) {
                int c = Integer.parseInt(Character.toString(sb.charAt(i)));
                total += c;
            }
            j++;
            sb.delete(0, sb.length());
            sb.append(total);
            total = 0;
        }
        finalTotal = Integer.parseInt(sb.toString());
        return finalTotal;
    }

    public static void main(String[] args) {
        Main main = new Main();

        String s = "zbax";

        System.out.println(main.getLucky(s, 2));
    }
}
