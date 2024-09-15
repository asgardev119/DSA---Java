package Sorting.Quicksort;

public class quickSort {

    public static void quicksrt(int arr[], int si, int ei) {
        
        if (si >= ei) {
            return; // base case for recurtion;
        }

        int pIdx = partition(arr, si, ei);
        quicksrt(arr, si, pIdx - 1); // left
        quicksrt(arr, pIdx + 1, ei); // left

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make a place for swap ele

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap

                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 7, 6, 5, 1, 2, 3, 4 };
        quicksrt(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
