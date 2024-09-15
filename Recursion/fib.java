public class fib {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibon(n));
    }

    public static int fibon(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn1 = fibon(n - 1);
        int fn2 = fibon(n - 2);
        int fn = fn1 + fn2;
        return fn;
    }
}
