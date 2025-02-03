package ARRAYS.Array13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] nums = { 5, 0, 1, 2, 3, 4 };
        System.out.println(Arrays.toString(main.buildArray(nums)));
    }

    public int[] buildArray(int[] nums) {
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[nums[i]];
        }
        return nums2;
    }
}
