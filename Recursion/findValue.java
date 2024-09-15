public class findValue {

    public static int firstOccurence(int arr[], int k, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == k) {
            return i;
        }

        return firstOccurence(arr, k, i + 1);
    }

    public static int lastOccurence(int arr[], int k, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, k, i + 1);

        if (isFound == -1 && arr[i] == k) {
            return i;
        }
        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 5, 6, 8, 2 };
        int key = 2;
        System.out.println(firstOccurence(arr, key, 0));
        System.out.println(lastOccurence(arr, key, 0));
    }
}
