package String;

public class CompressStr {

    public static String CopressedStr(String str) {
        StringBuilder str2 = new StringBuilder();
        int count = 1;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                str2.append(str.charAt(i));
                if (count > 1) {
                    str2.append(count);
                }
                count = 1;
            }
        }
        return str2.toString();
    }

    public static void main(String[] args) {
        String str = "aaasswweees";
        System.out.println(CopressedStr(str));
    }

}
