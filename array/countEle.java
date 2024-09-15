public class countEle {

    public static void display(int arr[], int n) {
        boolean visit[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visit[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visit[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "->" + count);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 3, 4 };
        int n = arr.length;
        display(arr, n);

    }
}
