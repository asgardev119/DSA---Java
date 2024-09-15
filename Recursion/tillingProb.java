public class tillingProb {
    public static int tilingpr(int n) { // 2 X n floot size
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical
        int fnm = tilingpr(n - 1);

        // horizontal
        int fnm2 = tilingpr(n - 2);

        int total = fnm + fnm2;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(tilingpr(4));
    }
}
