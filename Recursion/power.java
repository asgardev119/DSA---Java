public class power {
    public static int Pow(int x, int n) {

        if (n == 1) {
            return x;
        }
        return x * Pow(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Pow(2, 5));
    }
}
