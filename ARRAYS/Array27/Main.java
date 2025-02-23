package ARRAYS.Array27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] groupSizes = { 2, 2, 1, 2, 2, 1 };
        System.out.println(main.groupThePeople(groupSizes).toString());
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();

        int size = 0;
        int counter = 0;
        int i = 0;
        int checkPoint = 0;
        boolean notChecked = false;
        // 2, 1, 3, 3, 3, 2
        while (i < groupSizes.length) {
            List<Integer> group = new ArrayList<>();
            size = groupSizes[i];
            for (int j = i; j < groupSizes.length; j++) {
                if (counter == size) {
                    break;
                }
                if (size == groupSizes[j]) {
                    counter++;
                    i++;
                    group.add(j);
                } else {
                    if (notChecked == false) {
                        checkPoint = j;
                        System.out.println(checkPoint);
                        notChecked = true;
                    }
                }
            }
            notChecked = false;
            counter = 0;
            list.add(group);
        }

        return list;
    }
}
