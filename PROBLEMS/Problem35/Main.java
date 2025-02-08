package PROBLEMS.Problem35;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int grams = 2;
        System.out.println(main.convertNineKGold(grams));
    }

    public double convertNineKGold(int grams) {
        double gold = 2003.11;
        double pesos = grams * gold;
        return pesos;
    }
}
