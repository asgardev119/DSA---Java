package Backtracking;

public class numsubset {
    public static void subsetPrint(String n, int index, String subset) {
        if (index == n.length()) {

            if (subset.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(subset);
            }
            return;
        }

        subsetPrint(n, index + 1, subset + n.charAt(index));
        subsetPrint(n, index + 1, subset);
    }

    public static void main(String[] args) {
        String n = "123";

        subsetPrint(n, 0, "");
    }
}
