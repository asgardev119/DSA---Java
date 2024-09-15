package String;
//equalsIgnoreCase is  method which is campare two char wihtout lowerCase or UpperCase 

// charAt is a method which is store a single character on base of index for a string

public class PalindrumString {

    // public static boolean chechPalindrum(String name) {
    //     for (int i = 0; i < name.length() / 2; i++) {
    //         int n = name.length(); 
    //         if (name.charAt(i) != name.charAt(n - 1 - i)) {
    //             System.out.println("no Palindrum");
    //             return false;
    //         }
    //     }
    //     System.out.println("yes Palindrum");
    //     return true;

    // }

    public static void revStr(String name) {
        int n = name.length();
        String revname = "";

        for (int i = 0; i < n; i++) {
            revname = name.charAt(i) + revname;
        }

        if (name.equalsIgnoreCase(revname)) {
            System.out.println("yes Palindrum");
        } else {
            System.out.println("no Palindrum");
        }

    }

    public static void main(String[] args) {
        String name = "racecawwerr";
        revStr(name);
        // System.out.println(chechPalindrum(name));
    }
}
