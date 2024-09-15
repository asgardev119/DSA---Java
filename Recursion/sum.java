public class sum {
    public static int calSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sn = calSum(n - 1);  
        int sm = n + sn;
        return sm;
    }

    public static void main(String[] args) {
        System.out.println(calSum(10));
    }
}
