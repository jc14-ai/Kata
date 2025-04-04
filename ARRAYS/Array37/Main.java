package ARRAYS.Array37;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(createTargetArray(new int[] { 3, 4, 5, 7, 1 }, new int[] { 4, 4, 2, 1, 3 }));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
