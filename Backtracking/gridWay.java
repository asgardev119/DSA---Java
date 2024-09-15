package Backtracking;
//code for source to destination 
public class gridWay {
    public static int ways(int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) { // base case------->
            return 0;
        }

        int w1 = ways(n, m, i + 1, j);
        int w2 = ways(n, m, i, j + 1);
        int totalWays = w1 + w2;

        return totalWays;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(ways(n, m, 0, 0));

    }
}
