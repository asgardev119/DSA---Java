package ArrayList;

import java.util.*;

public class multiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(14);
        list1.add(15);

        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        System.out.println(mainList); // print multi Arraylist

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.println(currList.get(j));
            }
        }

    }
}
