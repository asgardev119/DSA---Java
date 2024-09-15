package twodArray;

import java.util.Scanner;

public class printEle {
    public static void main(String[] args) {
        int r = 2, c = 2;
        int totel = r * c;
        System.out.println("enter" + " " + totel + " " + "element");
        int arr[][] = new int[r][c];
        int k = 5;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");

                // condition for check element exits in array or not
                // if (arr[i][j] == k) {
                // System.out.println("yes availble index no of : " + i + "," + j);
                // }
            }

            System.out.println();
        }

    }
}
