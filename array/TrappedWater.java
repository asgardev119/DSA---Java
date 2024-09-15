public class TrappedWater {

    public static void trappedWtr(int height[], int n) {
        // calculate the leftmax boundary

        int leftmx[] = new int[n];

        leftmx[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmx[i] = Math.max(height[i], leftmx[i - 1]);
        }
        // calculate the rightmax boundary
        int rightmx[] = new int[n];
        rightmx[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmx[i] = Math.max(height[i], rightmx[i + 1]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterleve min(leftmax , rightmax)
            int waterLevel = Math.min(leftmx[i], rightmx[i]);
            // trappedwtr = waterlevel-height
            trappedWater += waterLevel - height[i];
        }
        System.out.println(trappedWater);

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int n = height.length;
        trappedWtr(height, n);
    }
}
