package ARRAYS.Array35;

public class Main {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] { 2, 3, 1 }));
    }

    public static int subarraySum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            for (int j = start; j < i + 1; j++) {
                sum += nums[j];
            }
        }
        return sum;
    }
}
