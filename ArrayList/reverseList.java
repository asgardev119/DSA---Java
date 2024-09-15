package ArrayList;

import java.util.ArrayList;

public class reverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

        // System.out.println(list);

        for (int i = 0 ; i <list.size(); i++) {
            System.out.println(list.get(i) + "  ");
        }
        System.out.println("-----------------");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i) + "  ");
        }
    }
}
