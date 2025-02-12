package ARRAYS.Array22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] candies = { 12, 1, 12 };
        int extraCandies = 3;
        System.out.println(main.kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < i - 1; j++) {
                if (candies[j] < candies[i]) {
                    list.add(false);
                    break;
                }
            }
            list.add(true);
        }

        return list;
    }
}
