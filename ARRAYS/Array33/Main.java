package ARRAYS.Array33;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 2, 2, 1 }));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
                continue;
            }
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                res = nums[i];
        }

        return res;
    }
}
