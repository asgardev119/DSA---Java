

public class Bsearch {

    public static int bfun(int arr[], int key) {
        int s = 0;
        int e = arr.length;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) { // commparision
                System.out.println(arr[mid]);
                return mid;
            }
            if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] arg) {
        int arr[] = { 2, 3, 4, 5, 7, 6 };
        int k = 6;

        System.out.println("index no of key : " + bfun(arr, k));

    }
}
