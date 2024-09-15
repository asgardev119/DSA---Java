public class strtobin {
    public static void str(int n, int lp, String text) {
        if (n == 0) {
            System.out.println(text);
            return;
        }

        str(n - 1, 0, text + "0");
        if (lp == 0) {
            str(n - 1, 1, text + "1");
        }
    }

    public static void main(String[] args) {

        str(3,0,"");
    }
}
