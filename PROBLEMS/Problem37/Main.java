package PROBLEMS.Problem37;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String date = "1900-01-01";
        System.out.println(main.convertDateToBinary(date));
    }

    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))));
        sb.append('-');
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))));
        sb.append('-');
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(8, 10))));
        return sb.toString();
    }
}
