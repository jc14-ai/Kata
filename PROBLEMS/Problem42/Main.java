package PROBLEMS.Problem42;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[] { 2, 1, 5, 1, 3, 2 }, 3));
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
