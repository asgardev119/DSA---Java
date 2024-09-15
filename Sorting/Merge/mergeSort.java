package Sorting.Merge;

public class mergeSort {

    public static void merge(int arr[], int f, int mid, int l) {
        int i = f; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp
        int tempArr[] = new int[l - f + 1]; // for stored copyied data

        while (i <= mid && j <= l) {
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;

            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }
        // left side----
        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }
        // right side---
        while (j <= l) {
            tempArr[k++] = arr[j++];
        }

        // copy data
        for (k = 0, i = f; k < tempArr.length; k++, i++) {
            arr[i] = tempArr[k];
        }
    }

    public static void mergesrt(int arr[], int f, int l) {

        if (f >= l) {
            return;
        }
        int mid = (f + l) / 2;

        mergesrt(arr, f, mid);
        mergesrt(arr, mid + 1, l);
        merge(arr, f, mid, l);

    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 5 };
        mergesrt(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
