package PROBLEMS.Problem51;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(countMatches(null, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int j = 0;
        

        if (ruleKey.equals("type")) {
            j = 0;
        } else if (ruleKey.equals("color")) {
            j = 1;
        } else {
            j = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(j).equals(ruleValue)) {
                res++;
            }
        }

        return res;
    }
}
