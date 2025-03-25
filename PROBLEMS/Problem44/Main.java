package PROBLEMS.Problem44;

public class Main {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[] { 0, 1, 4, 6, 7, 10 }, 3));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int triplets = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff)
                        triplets++;
                }
            }
        }

        return triplets;
    }
}
