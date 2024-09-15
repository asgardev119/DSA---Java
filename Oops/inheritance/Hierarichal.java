package Oops.inheritance;

public class Hierarichal {
    public static void main(String[] args) {
        Grandson gs = new Grandson();
        Son s = new Son();
        s.sonFun();
        gs.GrandsonFun();
        gs.fatherFun();

    }
}

class Father {
    public int Property = 200;

    void fatherFun() {
        System.out.println("Father Calling...");
    }
}

class Son extends Father {
    void sonFun() {
        System.out.println("Son Fun Property is: " + Property);
    }
}

class Grandson extends Father {
    void GrandsonFun() {
        System.out.println("Grandson fun Calling..." + Property);
    }
}
