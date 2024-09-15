
// package array;
import java.util.*;
import java.util.Scanner;

public class array {

    static void printArray() {
        // print array from take value from User:--------->
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter the elements of for array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void sumArray() {

        // sum of a array----->
        int sum = 0;
        int arr[] = { 4, 3, 2, 5, 6, 40 };
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("total sum of array = " + sum);

    }

    static int findArray() {
        // Java Array Program to Find the Largest Element in an Array--->
        int arr[] = { 4, 3, 2, 5, 6, 40 };
        int findvalue;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value whats you Find: ");
        findvalue = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findvalue) {
                findvalue = arr[i];
                System.out.println(" value is " + arr[i] + " , index of value : " + i);
                return 1;
            }
        }

        return -1;
    }

    static public void printFindvalue() {
        int ind = findArray();
        if (ind == -1) {
            System.out.println("Not availble avlue");
        } else {
            System.out.println("availble Value");
        }
    }

    static void twodArray() {
        Scanner s = new Scanner(System.in);
        int r, c;
        System.out.println("enter number of row: ");
        r = s.nextInt();
        System.out.println("enter number of column: ");
        c = s.nextInt();
        int twArray[][] = new int[r][c]; // initalize a 2d Array:

        System.out.println("enter number for matrics: ");

        for (int i = 0; i < twArray.length; i++) {
            for (int j = 0; j < twArray.length; j++) {
                twArray[i][j] = s.nextInt(); // store element in array:
            }

        }

        // print 2d array --->

        for (int i = 0; i < twArray.length; i++) {
            for (int j = 0; j < twArray.length; j++) {
                System.out.print(twArray[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void main(String[] asgar) {
        // printArray();
        // sumArray();
        // printFindvalue();
        // twodArray();

    }
}
