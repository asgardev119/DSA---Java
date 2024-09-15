package String;
import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {
        String name;
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a word: ");
        name = str.nextLine();
        int n = name.length();
        String revName = "";
        for (int i = n-1 ; i >= 0; i--) {
            revName = revName + name.charAt(i);
        }
        System.out.println("Reverse String: " + revName);
    }
}
