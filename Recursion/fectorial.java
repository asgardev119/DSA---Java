public class fectorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        int fn = n * fact(n - 1);
        System.out.println(n + " " + fn);

        return fn;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fact(n));

    }
}
