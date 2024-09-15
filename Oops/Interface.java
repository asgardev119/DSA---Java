package Oops;

public class Interface {
    public static void main(String arg[]) {
        data d = new data();
        d.print();
        d.eat();
    }
}

interface display {
    void print();
}

interface animal {
    void eat();
}

// for multiple inheritance:

class data implements display, animal {
    public void print() {
        System.out.println("Animal are available");
    }

    public void eat() {
        System.out.println("all animal need food");
    }
}