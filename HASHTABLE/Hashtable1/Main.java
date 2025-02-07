package HASHTABLE.Hashtable1;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(main.numJewelsInStones(jewels, stones));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int jewelCount = 0;

        for (int i = 0; i < jewels.length(); i++) {
            char aJewel = jewels.charAt(i);

            for (int j = 0; j < stones.length(); j++) {
                if (aJewel == stones.charAt(j)) {
                    jewelCount++;
                }
            }
        }

        return jewelCount;
    }
}
