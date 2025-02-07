package ARRAYS.Array16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] nums = { 3, 3 };
        int target = 6;

        System.out.println(Arrays.toString(main.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    indices[0] = j;
                    indices[1] = i;
                    return indices;
                }
            }
        }
        return indices;
    }
}
