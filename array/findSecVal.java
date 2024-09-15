// find second largest value in array

public class findSecVal {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 11, 44, 55, 56, 23, 57 };
        int largest =  Integer.MIN_VALUE; // minumvalue
        int secLargest = Integer.MIN_VALUE; // minumvalue

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] != largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }

        }
        // for (int i = 0; i < arr.length - 1; i++) {
        // System.out.print(arr[i] + " ");
        // }

        System.out.println("Largest-------> : " + largest);
        System.out.println("SecondLargest-------> : " + secLargest);

    }
}
