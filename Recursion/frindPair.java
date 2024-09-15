public class frindPair {
    public static int pairfrnd(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // single

        // int fnm1 = pairfrnd(n - 1);
        // int fnm2 = pairfrnd(n - 2);

        // int pairway = (n - 1) * fnm2;
        // int totWay =  fnm1+pairway;

        // return totWay;

        return pairfrnd(n - 1) + (n - 1) * pairfrnd(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(pairfrnd(3));
    }
}
