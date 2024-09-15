package ArrayList;

import java.util.ArrayList;

public class Printlist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(6);
        list.add(5);
        list.add(8);

        // int abl = list.get(2);
        // System.out.println(abl);

        // list.contains(2, 10);
        // list.remove(3);

        // boolean va = list.contains(6);
        // System.out.println(va); // gives true or false if value is exist or not

        // list.set(1, 20); // add value on given index it's take two parameter index
        // and value
        System.out.println(list);
        System.out.println(list.size()); // give length of arraylist

    }
}
