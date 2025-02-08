package ARRAYS.Array18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] nums = { 1, 1, 2, 2 };
        int n = 2;
        System.out.println(Arrays.toString(main.shuffle(nums, n)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int r = 0;
        int mid = n;
        for (int i = 0; i < mid; i++) {
            result[r] = nums[i];
            result[r + 1] = nums[n];
            n++;
            r += 2;
        }

        return result;
    }
}
