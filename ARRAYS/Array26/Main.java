package ARRAYS.Array26;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] A = { 2, 3, 1 };
        int[] B = { 3, 1, 2 };
        System.out.println(Arrays.toString(main.findThePrefixCommonArray(A, B)));
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> table = new HashMap<>();
        int[] output = new int[A.length];
        int counter = 0;
        for (int i = 0; i < output.length; i++) {
            table.put(i, A[i]);
            for (int j = i; j >= 0; j--) {
                if (table.containsValue(B[j])) {
                    counter++;

                }
                output[i] = counter;
            }
            counter = 0;
        }
        return output;
    }
}
