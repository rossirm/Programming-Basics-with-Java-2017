import java.util.Scanner;

public class p09_House {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int starsNumber = 0;
        int dashNumber = 0;

        for (int i = 1; i < (n + 1) / 2; i++) {
            if (i == 1 && n % 2 == 0) {
                System.out.println(repeatStr("-", ((n + 1) / 2) - 1) +
                        "**" + repeatStr("-", ((n + 1) / 2) - 1));
                starsNumber += 2;
            } else if (i == 1 && n % 2 != 0) {
                System.out.println(repeatStr("-", ((n + 1) / 2) - 1) +
                        "*" + repeatStr("-", ((n + 1) / 2) - 1));
                starsNumber += 1;
            }
            starsNumber += 2;
            if (n % 2 == 0) {
                dashNumber = n - i - ((n + 1) / 2) - 1;
            } else {
                dashNumber = n - i - ((n + 1) / 2);
            }
            System.out.println(repeatStr("-", dashNumber) + repeatStr("*", starsNumber) +
                    repeatStr("-", dashNumber));
        }
        for (int i = 0; i < (n / 2); i++) {
            System.out.println("|" + repeatStr("*", n - 2) + "|");
        }
    }

    public static String repeatStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }
        return result.toString();
    }
}

