package PROBLEMS.Problem50;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(sortPeople(new String[] {}, new int[] {}));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] res = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }

            }
        }

        for (int i = 0; i < heights.length; i++) {
            res[i] = map.get(heights[i]);
        }

        return res;
    }
}
