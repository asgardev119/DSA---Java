// sorting is method to arranging data in a mode like asscending and desceding mode 
// there are diffrent types: 1. Bubble sorting
// in bubble sort compare  the adjecent element swap then  when it wrong  order------->

package Sorting;

class bubbleSort {

    public static void BubbleFun(int arr[], int size) {
        for (int i = 0; i < size; i++) { // counting the element
            for (int j = 0; j <size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }

        System.out.println("Sorting Array ---> ");
    }

    public static void main(String[] args) {
        int arr[] = {0, 4, 6, 3, 7, 1, 8, 6, 9 };
        int n = arr.length;
        BubbleFun(arr, n);
        for(int i = 0; i<n ; i++){
            System.out.println(arr[i]);
        }
    }

}