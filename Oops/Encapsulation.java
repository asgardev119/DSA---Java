package Oops;

// it a process in java which is binding data into a single unit called encapsulation

public class Encapsulation {
    public static void main(String[] args) {
        Enc obj = new Enc();
        obj.display(50);

    }

}

class Enc {
    private int id = 23;
    int n = 10;

    public int nn = 10;

    void display(int total) {
        int sum = id + n;
        total = sum + total;
        System.out.println(total);

    }

}
