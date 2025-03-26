package PROBLEMS.Problem46;

public class Main {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    public static int balancedStringSplit(String s) {
        int rCount = 0;
        int lCount = 0;

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (rCount == lCount) {
                lCount = 0;
                rCount = 0;
                res++;
            }

            if (s.charAt(i) == 'R') {
                rCount++;
                continue;
            }
            if (s.charAt(i) == 'L') {
                lCount++;
                continue;
            }

        }

        return res;
    }
}
