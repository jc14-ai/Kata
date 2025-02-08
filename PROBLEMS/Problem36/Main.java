public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String address = "1.1.1.1";
        System.out.println(main.defangIPaddr(address));
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
