package Backtracking;

//print subset of string using backtracking

public class subset {
    public static void printSubset(String str, String set, int i) {
        if (i == str.length()) {
            System.out.println(set);
            return;
        }

        // for yes condition
        printSubset(str, set + str.charAt(i), i + 1);

        // for no condition
        printSubset(str, set, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        String subSet = "";
        printSubset(str, subSet, 0);

    }
}
