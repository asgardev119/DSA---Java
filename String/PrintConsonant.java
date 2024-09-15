package String;

public class PrintConsonant {
    public static void main(String[] args) {
        String alphabets = "uabcdefghijklmnopqrstuvwxyz";
        String vowel = "aeiou";

        for (int i = 0; i < alphabets.length(); i++) {
            boolean isConsonant = true;
            char currentChar = alphabets.charAt(i);
            for (int j = 0; j < vowel.length(); j++) {
                if (currentChar == vowel.charAt(j)) {
                    // System.out.print(currentChar + " "); for print only Vowel
                    isConsonant = false;
                    break;
                }
            }
            if (isConsonant) {
                System.out.println(currentChar); // print only Consonant
            }
        }
    }
}





