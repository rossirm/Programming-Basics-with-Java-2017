import java.util.Scanner;

public class p05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // first

        for (int i = 0; i < n; i++) {
            //int leftSpace = n;
            //int leftSpace = ((3 * n + 6) - (2 * n + 1)) - 5;
            int rightSpace = ((3 * n + 6) - n) - 5;
            System.out.println(repStr(" ", n) + "~ ~ ~" +
                    repStr(" ", rightSpace));
        }
        //middle JAVA
        System.out.println(repStr("=", (3 * n + 6) - 1));
        if (n == 3) {
            System.out.println("|" + repStr("~", n) + "JAVA" + repStr("~", n) +
                    "|" + repStr(" ", n - 1) + "|");
        } else if (n > 3) {
            for (int i = 0; i < n - 3; i++) {
                int curve = 2 * n + 4;
                int space = n - 1;
                System.out.println("|" + repStr("~", curve) + "|" + repStr(" ", space) + "|");
                if (i == ((n - 2) / 2) - 1) {
                    System.out.println("|" + repStr("~", curve - (curve - n))
                            + "JAVA" + repStr("~", curve - (curve - n)) + "|" + repStr(" ", space) + "|");
                }
                //System.out.println("|~~~JAVA~~~|  |");
            }
        }
        System.out.println(repStr("=", (3 * n + 6) - 1));
        // bottom
        int leftSpaces = 0;
        int rightSpaces = n;
        int at = 2 * n + 4;
        for (int i = 0; i < n; i++) {
            System.out.println(repStr(" ", leftSpaces) + "\\" + repStr("@", at) +
                    "/" + repStr(" ", rightSpaces));
            leftSpaces++;
            rightSpaces--;
            at -= 2;
        }
        // down
        System.out.println(repStr("=", (3 * n + 6) - n));
    }

    private static String repStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
