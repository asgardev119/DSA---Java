public class optimizedPow {
    public static int optPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int half = optPow(x, n / 2);

        // for n is even
        int full = half * half;

        // for n is odd

        if (n % 2 != 0) {
            full = x * full;
        }

        return full;
    }

    public static void main(String[] args) {
        System.out.println(optPow(2, 6));
    }
}
