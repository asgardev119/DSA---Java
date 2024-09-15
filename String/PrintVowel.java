package String;

public class PrintVowel {
    public static void main(String[] args) {
        String alphabets = "uabcdefghijklmnopqrstuvwxyz";
        String vowel = "aeiou";
        for (int i = 0; i < alphabets.length(); i++) {
            for (int j = 0; j < vowel.length(); j++) {
                if (alphabets.charAt(i) == vowel.charAt(j)) {
                    System.out.println(alphabets.charAt(i));
                }
            }
        }
    }
}
