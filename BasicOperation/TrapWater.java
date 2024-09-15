package BasicOperation;

public class TrapWater {

    public static void hightWater(int arr[]) {
        int n = arr.length;
        int TotaltrappedWater = 0;

        // calculate leftmax boundary
        int leftsideMax[] = new int[n];
        leftsideMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftsideMax[i] = Math.max(leftsideMax[i-1], arr[i]);
        }

        // calculate rightmax boundary

        int rightSideMax[] = new int[n];
        rightSideMax[n - 1] = arr[n - 1];

        for (int j = n - 2; j >= 0; j--) {
            rightSideMax[j] = Math.max(rightSideMax[j+1], arr[j]);
        }

        for (int k = 0; k < n; k++) {
            int waterLevel = Math.min(rightSideMax[k], leftsideMax[k]);
            TotaltrappedWater += waterLevel - arr[k];
        }

        System.out.print(TotaltrappedWater);
    }

    public static void main(String[] args) {
        // arr is given also hight of boundary
        int arr[] = { 4, 2, 0, 6, 3,2, 5 };
        hightWater(arr);
    }
}
