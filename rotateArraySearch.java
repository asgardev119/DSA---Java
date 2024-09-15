public class rotateArraySearch {

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        // case found
        int mid = (si + ei) / 2;
        
        if (arr[mid] == target) {
            return mid;
        }

        // mid on l1
        if (arr[si] <= arr[mid]) {
            // case a left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // case b left
                return search(arr, target, mid + 1, ei);
            }
        }

        // mid on l2
        else {

            // case d right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }

            // case e right
            else {
                return search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 1, 2, 3 };
        int target = 17;
        int ind = search(arr, target, 0, arr.length - 1);
        System.out.println(ind);

    }
}
