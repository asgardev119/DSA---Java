package Backtracking;

//time complexcity of n Queens is "O(n!)"
public class nQueen {

    public static boolean isSafe(char chessBoard[][], int row, int col) {
        // for check vertical
        for (int i = row - 1; i >= 0; i--) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }

        }
        // for heck up left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        // for check down left diagonal

        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char chessBoard[][], int row) {
        if (row == chessBoard.length) {
            displayBoard(chessBoard);
            countWays++;
            return;
        }

        for (int j = 0; j < chessBoard.length; j++) {
            if (isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q';
                nQueens(chessBoard, row + 1);
                chessBoard[row][j] = 'X';

            }
        }
    }

    public static void displayBoard(char chessBoard[][]) {
        System.out.println("------------------");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.err.println();
        }
    }

    static int countWays = 0;

    public static void main(String[] args) {
        int n = 4;
        char chessBoard[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'X';
            }
        }

        nQueens(chessBoard, 0);
        System.out.println("Total Count of Ways for Solution: " + countWays);
    }
}
