package ArrayList;

import java.util.*;

public class multiAryarlist2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i);
            list2.add(i * 2);
        }
        mainList.add(list1);
        mainList.add(list2);
        System.out.println(mainList);
    }
}
