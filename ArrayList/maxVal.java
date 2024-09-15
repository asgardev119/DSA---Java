package ArrayList;

import java.util.ArrayList;

public class maxVal {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(6);
        list.add(5);
        list.add(8);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println(max);

    }
}
