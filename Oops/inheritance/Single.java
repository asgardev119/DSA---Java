package Oops.inheritance;

public class Single {
    public static void main(String[] args) {
        chlid ch = new chlid();
        ch.parent();
        ch.display();
    }
}

class Parent {
    public int mob = 12345;
    String name = "Asagar";

    String parent() {
        System.out.println(name);
        return name;

    }
}

class chlid extends Parent {
    void display() {
        System.out.println(mob + " " + name);
    }
}
