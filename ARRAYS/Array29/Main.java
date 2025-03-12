package ARRAYS.Array29;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String boxes = "110";
        System.out.println(Arrays.toString(main.minOperations(boxes)));
    }

    public int[] minOperations(String boxes) {
        int step = 0;
        int[] res = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {

            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1' && j != i) {
                    step += Math.abs(i - j);
                }
            }

            res[i] = step;
            step = 0;
        }

        return res;
    }
}
