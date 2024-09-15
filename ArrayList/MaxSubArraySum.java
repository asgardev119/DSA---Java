package ArrayList;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,10};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                // System.out.println(sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }

            }
        }
        System.out.print("MaxSum : " + maxSum);

    }
}
