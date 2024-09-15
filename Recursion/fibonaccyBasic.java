import java.util.Scanner;

public class fibonaccyBasic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number wher u want to print fibnoccy Number: ");

        int n = sc.nextInt();
        int ft = 0, st = 1;
        int sm = 0;

        // ft - firstTerm
        // st - secondTerm
        // sm - sum

        for (int i = ft; i <= n; i++) {
            System.out.println(ft + " ");
            int nt = ft + st;
            sm += ft;
            ft = st;
            st = nt;

        }
        System.out.println("tottal sum of Fib: " + sm);

    }
}
