package PROBLEMS.Problem39;

public class Main {
    public static void main(String[] args) {
        String s = "10101";
        int k = 1;

        System.out.println(countKConstraintSubstrings(s, k));
    }

    public static int countKConstraintSubstrings(String s, int k) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int ones = 0;
                int zeros = 0;
                String subS = s.substring(i, j + 1);

                for (int c = 0; c < subS.length(); c++) {
                    if (subS.charAt(c) == '1') {
                        ones++;
                    } else {
                        zeros++;
                    }
                }

                if (ones <= k || zeros <= k) {
                    res++;
                }
            }
        }

        return res;
    }
}
