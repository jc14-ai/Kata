package PROBLEMS.Problem49;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('k', 'l');
        System.out.println(map.get('k'));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1, 3 }));
    }

    public static String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        for (int i = 0; i < indices.length; i++) {
            sb.append(map.get(i));
        }

        return sb.toString();
    }
}
