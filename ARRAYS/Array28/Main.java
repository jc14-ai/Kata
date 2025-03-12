package ARRAYS.Array28;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Main main = new Main();

        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(main.transformArray(nums)));
    }

    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
                continue;
            }
            nums[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }

        return nums;
    }
}
