package ArrayList;

import java.util.ArrayList;

public class swaptwoele {

   

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(56);
        list.add(6);
        list.add(5);
        list.add(8);

        int idx1 = 1;
        int idx2 = 2;

        System.out.println(list);
       int tmp = list.get(idx1);
       System.out.println(tmp);

       list.set(idx1, list.get(idx2));
       list.set(idx2, tmp);

       System.out.println(list);



    }
}
