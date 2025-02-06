package PROBLEMS.Problem34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] nums = { 7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2 };
        System.out.println(Arrays.toString(main.getSneakyNumbers(nums)));
    }

    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> table = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (!table.isEmpty() && table.contains(nums[i])) {
                list.add(nums[i]);
                continue;
            }
            table.add(nums[i]);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
