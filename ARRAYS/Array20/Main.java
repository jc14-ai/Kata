package ARRAYS.Array20;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(main.maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        int result = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }

}
