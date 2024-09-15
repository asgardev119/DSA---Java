package Oops;
// package String;

public class ClassAndObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red", 20);
        // System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int n1 = 10;

    void setColor(String col, int n2) {
        color = col;
        int n3 = n1 * n2;
        System.out.println(n3);
    }
}
