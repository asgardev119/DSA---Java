package BasicOperation;

import java.util.*;

public class Array1st {

    // public static int Bsearch(int arr[], int k) {
    // int start = 0;
    // int end = arr.length - 1;

    // while (start <= end) {
    // int mid = (start + end) / 2;
    // if (arr[mid] == k) {
    // return 1;
    // } else if (arr[mid] < k) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // public static int Lsearch(int arr[], int k) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == k) {
    // k = arr[i];
    // return k;
    // }
    // }
    // return -1;
    // }

    public static void ReverseArray(int arr[]) {
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i]);
        // }

        int f = 0, s = arr.length - 1;
        while (f < s) {
            int temp = arr[s];
            arr[s] = arr[f];
            arr[f] = temp;
            f++;
            s--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 7;

        // int res = Bsearch(arr, key);
        // if (res == 1) {
        // System.out.println("data exits");
        // } else {
        // System.out.println("data not exist");
        // }

        // System.out.println(Lsearch(arr, key));

        ReverseArray(arr);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        
        for (int ele : arr) {
            System.out.println(ele);
        }

    }
}
