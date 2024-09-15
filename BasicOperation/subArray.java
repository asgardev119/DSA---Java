
package BasicOperation;

class subArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8 };
        int i, j, k;

        // 1st logic----------------------------------------------------->

        // for (i = 0; i < arr.length; i++) {
        // for (j = i; j < arr.length; j++) {
        // for (k = i; k <= j; k++) {
        // System.out.print(arr[k]);
        // }
        // System.out.println();

        // }
        // System.out.println();
        // }

        // brute force 2nd logic--------------------------------------------------->
        int maxSum = Integer.MIN_VALUE;
        int currentSum;
        // System.out.println("maxium sum of subArray--->");

        // for (i = 0; i < arr.length; i++) {
        // for (j = i; j < arr.length; j++) {
        // currentSum = 0;
        // for (k = i; k <= j; k++) {
        // currentSum += arr[k];
        // }

        // System.out.println(currentSum);
        // if (maxSum < currentSum) {
        // maxSum = currentSum;
        // }
        // }
        // System.out.println("-----");

        // }
        // System.out.print("maxSum: " + maxSum);

        // prefix sum 3rd logic-------------------------------------------------->

        // int prefix[] = new int[arr.length];
        // prefix[0] = arr[0];
        // for (i = 1; i < prefix.length; i++) {
        // prefix[i] = prefix[i - 1] + arr[i];
        // }

        // for (i = 0; i < arr.length; i++) {
        // for (j = 0; j < arr.length; j++) {
        // currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        // if (maxSum < currentSum) {
        // maxSum = currentSum;
        // }
        // }
        // }

        // System.out.println(maxSum);

        // }

        // kadane algo 4th logic-------------------------------------------------->

        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);

    }
}