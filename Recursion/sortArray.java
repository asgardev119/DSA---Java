//check array is sort or not using Recursion

public class sortArray {
    public static Boolean isBool(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            // System.out.println(i +" " +     arr[i]);
            return false;
        }

        return isBool(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int i = 0;
        System.out.println(isBool(arr, i));

    }
}
