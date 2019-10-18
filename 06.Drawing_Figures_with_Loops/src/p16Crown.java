// ERROR ERROR ERROR

import java.util.Scanner;

public class p16Crown {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        // first and second row
        System.out.println("@" + repeatStr(" ", ((2 * n) - 4) / 2) + "@" +
                repeatStr(" ", ((2 * n) - 4) / 2) + "@");
        System.out.println("**" + repeatStr(" ", ((2 * n) - 6) / 2) + "*" +
                repeatStr(" ", ((2 * n) - 6) / 2) + "**");

        int dots = 1;
        int holes = ((2 * n) - 10) / 2;
        int middleDots = 1;

        for (int i = 0; i < ((n / 2) + 4) - 4; i++) {
            System.out.println("*" + repeatStr(".", dots) +
                    "*" + repeatStr(" ", holes) + "*" +
                    repeatStr(".", middleDots) + "*" +
                    repeatStr(" ", holes) + "*" +
                    repeatStr(".", dots) + "*");
            dots++;
            holes -= 2;
            middleDots += 2;
        }
        int d = ((n * 2) - 1) - (((n / 2 - 1) * 2) + 4);
        System.out.println((repeatStr(".", n / 2 - 1) +
                repeatStr(".", d) + repeatStr(".", n / 2 - 1)));

        int bottomDot = (((2 * n) - 1) - (n + 3)) / 2;

        System.out.println(repeatStr(".", n / 2) +
                repeatStr("*", bottomDot) + repeatStr("*", bottomDot) +
                repeatStr(".", n / 2));


        System.out.println(repeatStr("*", (2 * n) - 1));
        System.out.println(repeatStr("*", (2 * n) - 1));

        //String length = "*..............*...........................*..............*";
        //System.out.println(length.length());
    }

    public static String repeatStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }
        return result.toString();
    }
}