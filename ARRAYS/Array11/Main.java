package ARRAYS.Array11;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        System.out.println(main.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int candidate = prices[0];
        int maxStock = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > candidate) {
                if (prices[i] - candidate > maxStock) {
                    maxStock = prices[i] - candidate;
                }
            } else {
                candidate = prices[i];
            }
        }

        return maxStock;
    }
}
