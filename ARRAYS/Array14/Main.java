package ARRAYS.Array14;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String[] operations = { "++X", "++X", "X++" };
        System.out.println(main.finalValueAfterOperations(operations));
    }

    public int finalValueAfterOperations(String[] operations) {
        int val = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("-")) {
                val--;
                continue;
            } else if (operations[i].contains("+")) {
                val++;
            }
        }
        return val;
    }
}
