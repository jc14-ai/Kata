package ARRAYS.Array15;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] nums = { 1, 2, 3 };
        System.out.println(main.numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {
        int good = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]) {
                    good++;
                }
            }
        }
        return good;
    }
}
