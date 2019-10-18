import java.util.Scanner;

public class p14_Cup {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int capDots = ((5 * n) - (n * 3)) / 2;
        int capella = n * 3;
        int dots = 0;
        int dots2 = 0;

        // capella
        for (int l = 0; l < n / 2; l++) {
            System.out.println(repeatStr(".", capDots) +
                    repeatStr("#", capella) + repeatStr(".", capDots));
            capDots += 1;
            capella -= 2;
        }
        // hole
        for (int k = 0; k < n / 2 + 1; k++) {
            if (k == 0) {
                dots = capDots;
                dots2 = capella - 2;
                System.out.println(repeatStr(".", dots) + "#" +
                        repeatStr(".", dots2) + "#" + repeatStr(".", dots));
            } else {
                dots += 1;
                dots2 -= 2;
                System.out.println(repeatStr(".", dots) + "#" +
                        repeatStr(".", dots2) + "#" + repeatStr(".", dots));
            }
        }
        System.out.println(repeatStr(".", ((5 * n) - n) / 2) +
                repeatStr("#", n) + repeatStr(".", ((5 * n) - n) / 2));
        for (int i = 0; i < n / 2; i++) {
            System.out.println(repeatStr(".", ((5 * n) - (n + 4)) / 2) +
                    repeatStr("#", n + 4) +
                    repeatStr(".", ((5 * n) - (n + 4)) / 2));
        }
        System.out.println(repeatStr(".", (5 * n - 10) / 2) +
                "D^A^N^C^E^" + repeatStr(".", (5 * n - 10) / 2));
        for (int j = 0; j < n / 2 + 1; j++) {
            System.out.println(repeatStr(".", ((5 * n) - (n + 4)) / 2) +
                    repeatStr("#", n + 4) +
                    repeatStr(".", ((5 * n) - (n + 4)) / 2));
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
