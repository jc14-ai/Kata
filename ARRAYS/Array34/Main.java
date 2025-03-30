package ARRAYS.Array34;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[] { 1, 2, 3, 4 })));
    }

    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < i + 1; j++) {
                temp += nums[j];
            }
            res[i] = temp;
        }

        return res;
    }
}
