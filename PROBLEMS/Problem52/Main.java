package PROBLEMS.Problem52;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int length = strs[0].length();

        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 1; i < strs.length; i++) {
            if (length > strs[i].length())
                length = strs[i].length();
        }

        for (int i = 0; i < length; i++) {
            int counter = 0;
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    counter++;
                }
            }
            if (counter == strs.length - 1) {
                sb.append(strs[0].charAt(i));
            } else {
                return sb.toString();
            }
        }

        return sb.toString();
    }
}
