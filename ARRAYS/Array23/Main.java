package ARRAYS.Array23;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] hours = { 5, 1, 4, 2, 2 };
        int target = 6;
        System.out.println(main.numberOfEmployeesWhoMetTarget(hours, target));

    }

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }
        return count;
    }
}
