package Oops;

//constructor is a special method in java which is invoked automaticaly.  and it is called
//when object is created
//there are three types: 1 non parameterized , 2 parameterized , 3 Copy Constructor

public class Constructor {
    public static void main(String[] args) {
        students s1 = new students(); // called Constructor
        students s2 = new students(12, "Asgar"); // parameterized Constructor, same parameter then called
        students s3 = new students(s2); // copy Constructor , this is copy a object to use it

    }
}

class students {
    String myName;
    int n;

    students() {
        System.out.println("Constructor Called....");
    }

    students(int n, String name) {
        this.myName = name;
        this.n = n;
        System.out.println("Receive parameter" + " " + myName + " " + n);
    }

    students(students s2) {
        this.myName = s2.myName;
        s2.n = 20; // set new value

        this.n = s2.n;
        System.out.println(myName + n);

    }
}
