import java.util.Scanner;

public class p08_Sunglasses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.println(repeatStr("*", 2 * n) +
                repeatStr(" ", n) +
                repeatStr("*", 2 * n));
        for (int i = 0; i < n - 2; i++) {
             if (i == (n - 1) / 2 -1) {
                System.out.println("*" + repeatStr("/", 2 * n - 2) +
                        "*" + repeatStr("|", n) + "*" +
                        repeatStr("/", 2 * n - 2) + "*");
            } else {
                System.out.println("*" + repeatStr("/", 2 * n - 2) +
                        "*" + repeatStr(" ", n) + "*" +
                        repeatStr("/", 2 * n - 2) + "*");
            }
        }
        System.out.println(repeatStr("*", 2 * n) +
                repeatStr(" ", n) +
                repeatStr("*", 2 * n));
    }

    public static String repeatStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
