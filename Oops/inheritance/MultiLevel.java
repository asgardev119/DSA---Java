package Oops.inheritance;

//gives output on online compiler not working here.
public class MultiLevel {
    public static void main(String[] args) {
        SubChild s1 = new SubChild(); // Corrected class name to SubChild
        s1.sub();
    }
}

class Parent {
    int a = 10;
    int b = 12;
}

class Child extends Parent {
    void sum() {
        int add = a + b;
        System.out.println("sum of Parent variable: " + add);
    }
}

class SubChild extends Child {
    void sub() {
        int subs = a - b;
        System.out.println("subs: " + subs);
    }
}
