public class reverseRec {

    // print Array

    public static void printArr(int arr[], int i) {
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i]);
        arr[i] = arr[i]-2;
        printArr(arr, i + 1);

      
    }

    // print Reverse Array
    public static void revPrintArr(int arr[], int i) {
        if (i == arr.length) {
            return;
        }
        revPrintArr(arr, i + 1);
        System.out.println(arr[i]);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        printArr(arr, 0);
        // revPrintArr(arr , 0);

    }
}
