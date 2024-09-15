package Oops;

// import java.sql.Struct;

// this Keywor is used to  Refer to the current  Object;

public class GetterAndSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("RED");
        p1.setTip(20);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

    }

}

class Pen {
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}
