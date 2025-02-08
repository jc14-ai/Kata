package ARRAYS.Array17;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] nums = { 1, 2, 3, 4 };
        System.out.println(main.minimumOperations(nums));
    }

    public int minimumOperations(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                total++;
            }
        }
        return total;
    }
}
