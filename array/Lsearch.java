// package array;
import java.util.*;

@SuppressWarnings("unused")
public class Lsearch {
    public static int linearSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(arr[i]);
                return 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 21, 23, 45, 56, 67 };
        int mess = linearSearch(arr, 21);
        if (mess == 1) {
            System.out.println("value availble");
        } else {
            System.out.println("not availble");
        }
    }
}
