package ARRAYS.Array32;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumAverage(new int[] { 1, 2, 36, 3, 0 }));
    }

    public static double minimumAverage(int[] nums) {
        double[] avg = new double[nums.length / 2];

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int left = nums.length - 1;
        for (int right = 0; right < nums.length / 2; right++) {
            avg[right] = (double) (nums[right] + nums[left]) / 2;
            left--;
        }

        double minAvg = avg[0];
        for (int i = 0; i < avg.length; i++) {
            if (avg[i] < minAvg)
                minAvg = avg[i];
        }

        return minAvg;
    }
}
