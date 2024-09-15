package Oops;

public class Abstract {
    public static void main(String[] args) {
        subset ch = new subset();
        ch.sum();

    }

}

abstract class add {
    String name;

    add() {
        this.name = "Asgar";
        System.out.println("helloo" + name);
    }

    abstract void sum();
}

class child extends add {
    void add() {
        System.out.println("helllo sub classs");
    }

    void sum() {
        int s = 12, e = 3;
        System.out.println(s + e + "sum is calling");
    }
}

class subset extends add {
    void sum() {
        System.out.println("subset Sum is Calling");
    }
}
