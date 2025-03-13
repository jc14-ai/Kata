package ARRAYS.Array31;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] nums = { -3, 4, 3, 2 };
        int pivot = 2;

        System.out.println(Arrays.toString(main.pivotArray(nums, pivot)));
    }

    public int[] pivotArray(int[] nums, int pivot) {
        int[] newNums = new int[nums.length];

        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                newNums[pos] = nums[i];
                pos++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                newNums[pos] = nums[i];
                pos++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                newNums[pos] = nums[i];
                pos++;
            }
        }

        return newNums;
    }
}
