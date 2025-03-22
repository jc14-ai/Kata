public class Main {
    public static void main(String[] args) {
        String s = "hfasl";
        System.out.println(swapVowels(s));
    }

    public static String swapVowels(String s) {
        StringBuilder sb = new StringBuilder();

        int firstC = 0;
        int lastC = 0;
        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(Character.toString(s.charAt(i)))) {
                firstC = i;
                break;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (vowels.contains(Character.toString(s.charAt(i)))) {
                lastC = i;
                break;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (i == firstC) {
                sb.append(s.charAt(lastC));
                continue;
            }
            if (i == lastC) {
                sb.append(s.charAt(firstC));
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
