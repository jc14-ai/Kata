package PROBLEMS.Problem41;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "abcddead";
        System.out.println(rearrange(s));
    }

    public static String rearrange(String s) {
        StringBuilder sb = new StringBuilder();
        String vowelSet = "aeiou";
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (vowelSet.contains(Character.toString(s.charAt(i)))) {
                vowels.add(s.charAt(i));
            } else {
                consonants.add(s.charAt(i));
            }
        }

        // if (vowels.size() != consonants.size() && (vowels.size() % 2 != 0 &&
        // consonants.size() % 2 != 0)) {
        // return "-1";
        // }

        int cons = 0, vows = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(vowels.get(vows));
                vows++;
            } else {
                sb.append(consonants.get(cons));
                cons++;
            }
        }

        return sb.toString();
    }
}
