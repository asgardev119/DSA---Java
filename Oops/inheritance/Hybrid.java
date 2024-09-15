package Oops.inheritance;

public class Hybrid {
    public static void main(String[] args) {
        Market m = new Market();
        Customer c = new Customer();
        m.buyPond();
        m.NeedFish();
        c.Swming();

    }
}

class Pond {
    String fish = "swming";
}

class malah extends Pond {
    void NeedFish() {
        System.out.println("Need Fish for sell");
    }
}

class Market extends malah {
    void buyPond() {
        System.out.println("Need Buy Pond");
    }
}

class Customer extends Pond {
    void Swming() {
        System.out.println("Every fish" + " " + fish);
    }
}
