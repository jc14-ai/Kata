package PROBLEMS.Problem42;

import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('c');
        System.out.println(Arrays.toString(set.toArray()));
        // System.out.println(maxSum(new int[] { 2, 1, 5, 1, 3, 2 }, 3));
    }

    public static int maxSum(int[] nums, int k) {
        int sum = 0;
        int left = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {
            if (right >= k) {
                sum += nums[right] - nums[left];
                max = Math.max(max, sum);
                left++;
                continue;
            }
            sum += nums[right];
            max = sum;
            System.out.println(max);

        }
        return max;
    }
}
