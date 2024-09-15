package String;

public class substr {
    public static void main(String[] args) {
        String name = "Asgar";
        for (int i = 0; i <= name.length(); i++) {
            System.out.println(name.substring(0, i));
        }
        System.out.println(name.toUpperCase()); // uppercase
        System.out.println(name.toLowerCase()); // lowerCase

        char nm[] = name.toCharArray(); // convert string to a char in a array

        for (int i = 0; i < nm.length; i++) {
            System.out.println(nm[i]);
        }

    }
}
