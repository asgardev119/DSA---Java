package Sorting;
// sorting is method to arranging data in a mode like asscending and desceding mode 

// there are diffrent types: 1. selectionSort

// in this sorting to pick the smallest element from unsorted and put it in bgining;

public class selectionSort {

    public static void selection(int arr[], int n) {
        for (int i = 0; i <= n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min]; // condition to check min value and i value not same then swap value
                arr[min] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 7, 1, 8, 6, 9 };
        int n = arr.length;
        selection(arr, n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}