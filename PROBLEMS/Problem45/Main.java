package PROBLEMS.Problem45;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[] { 3, -2, 1, -5, 2, -4 })));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] positives = new int[nums.length / 2];
        int[] negatives = new int[nums.length / 2];
        int[] res = new int[nums.length];

        int newIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positives[newIndex] = nums[i];
                newIndex++;
            }
        }

        newIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negatives[newIndex] = nums[i];
                newIndex++;
            }
        }

        int posIndex = 0;
        int negIndex = 0;
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = positives[posIndex];
                posIndex++;
            } else {
                res[i] = negatives[negIndex];
                negIndex++;
            }
        }

        return res;
    }
}
