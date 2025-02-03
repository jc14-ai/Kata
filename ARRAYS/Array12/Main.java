package ARRAYS.Array12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        int[] nums = { 1, 3, 2, 1 };

        System.out.println(Arrays.toString(main.getConcantenation(nums)));
    }

    public int[] getConcantenation(int[] nums) {
        int[] concatArray = new int[nums.length * 2];
        int i = 0;
        int j = 0;
        while (i < concatArray.length) {
            if (j == nums.length)
                j = 0;
            concatArray[i] = nums[j];
            i++;
            j++;
        }
        return concatArray;
    }
}
