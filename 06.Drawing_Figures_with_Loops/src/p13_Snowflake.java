import java.util.Scanner;

// Made by Rossi RM on 20.10.2017

public class p13_Snowflake {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int countDots = 0;
        int countDots2 = 0;
        int countStars = 0;

        System.out.println("*" + repeatStr(".", n) + "*" + repeatStr(".", n) + "*");
        for (int i = 0; i < n - 2; i++) {
            if (i == 0) {
                countDots = 1;
                countDots2 = n - 1;
                System.out.println(repeatStr(".", countDots) + "*" +
                        repeatStr(".", countDots2) + "*" + repeatStr(".", countDots2) +
                        "*" + repeatStr(".", countDots));
            } else {
                ++countDots;
                --countDots2;
                System.out.println(repeatStr(".", countDots) + "*" +
                        repeatStr(".", countDots2) + "*" + repeatStr(".", countDots2) +
                        "*" + repeatStr(".", countDots));
            }
        }
        System.out.println(repeatStr(".", n - 1) +
                repeatStr("*", 5) + repeatStr(".", n - 1));
        System.out.println(repeatStr("*", 2 * n + 3));
        System.out.println(repeatStr(".", n - 1) +
                repeatStr("*", 5) + repeatStr(".", n - 1));
        for (int i = 0; i < n - 2; i++) {
            if (i == 0) {
                countDots = n - 2;
                countDots2 = 2;
                System.out.println(repeatStr(".", countDots) + "*" +
                        repeatStr(".", countDots2) + "*" + repeatStr(".", countDots2) +
                        "*" + repeatStr(".", countDots));
            } else {
                --countDots;
                ++countDots2;
                System.out.println(repeatStr(".", countDots) + "*" +
                        repeatStr(".", countDots2) + "*" + repeatStr(".", countDots2) +
                        "*" + repeatStr(".", countDots));
            }
        }
        System.out.println("*" + repeatStr(".", n) + "*" + repeatStr(".", n) + "*");
    }

    public static String repeatStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
