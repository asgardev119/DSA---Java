package String;

public class FindShotedPath {

    public static float PrintPath(String path) {
        int x = 0, y = 0;
        int len = path.length();
        for (int i = 0; i < len; i++) {
            char dir = path.charAt(i);
            if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'S') {
                y--;
            } else {
                y++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String arg[]) {
        // String path = "WNEENESENNN";
        String path = "SN";

        System.out.println(PrintPath(path));
    }
}
