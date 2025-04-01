package ARRAYS.Array36;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(decompressRLElist(new int[] { 1, 2, 3, 4 }));
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
