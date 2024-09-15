package ArrayList;

import java.util.ArrayList;

public class question1 {

    public static void water(ArrayList<Integer> container) {
        int maxAmount = 0;
        for (int i = 0; i < container.size(); i++) {
            for (int j = i + 1; j < container.size(); j++) {
                int hi = Math.min(container.get(i), container.get(j));
                int wi = j - i;
                int currentWater = hi * wi;
                maxAmount = Math.max(maxAmount, currentWater);

            }
        }
        System.out.println(maxAmount);
    }

    public static void main(String[] args) {
        ArrayList<Integer> container = new ArrayList<>();
        container.add(1);
        container.add(8);
        container.add(6);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);
        water(container);
    }
}
