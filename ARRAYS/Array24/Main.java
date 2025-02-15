package ARRAYS.Array24;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] prices = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(main.finalPrices(prices)));
    }

    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        result[result.length - 1] = prices[prices.length - 1];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
                result[i] = prices[i];
            }
        }
        return result;
    }
}
