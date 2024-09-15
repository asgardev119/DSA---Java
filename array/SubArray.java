public class SubArray {
    public static void main(String[] args) {
        int arr[] = {6, 2, 3 };
        for (int i = 0; i < arr.length; i++) {
            int s = i;
            for (int j = s; j < arr.length; j++) {
                int e = j;
                for (int k = i; k <= e; k++) {
                    System.out.println(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
