package ArrayList;

import java.util.*;

public class waterTrapping {

    public static void storeWater(ArrayList<Integer> list) {

        int maxWater = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int ht = Math.min(list.get(i), list.get(j));
                int wth = j - i;
                int currWater = ht * wth;
                maxWater = Math.max(maxWater, currWater);

            }
        }
        System.out.println(maxWater);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        storeWater(list);
        // System.out.println(list);
    }
}
