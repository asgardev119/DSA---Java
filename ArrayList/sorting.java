package ArrayList;

import java.util.*;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(5);
        System.out.println(list);
        Collections.sort(list); // for accesending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); // for deccesending order

    }
}
