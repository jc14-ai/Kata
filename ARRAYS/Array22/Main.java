package ARRAYS.Array22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] candies = { 4, 2, 1, 1, 2 };
        int extraCandies = 1;
        System.out.println(main.kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= max) {
                list.add(true);
                continue;
            }
            list.add(false);
        }
        return list;
    }

}
