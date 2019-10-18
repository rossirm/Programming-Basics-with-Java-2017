import java.util.Scanner;

// made by Rossi RM on 2010.2017
public class p15_Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.println(repeatStr("#", (4 * n) + 1));
        int dots = 1;
        int fill = ((((4 * n) + 1) - 3)) / 2;
        int space = 1;
        for (int i = 0; i < n / 2; i++) {
            System.out.println(repeatStr(".", dots) +
                    repeatStr("#", fill) +
                    repeatStr(" ", space) +
                    repeatStr("#", fill) +
                    repeatStr(".", dots));
            dots++;
            fill -= 2;
            space += 2;
        }
        int space2 = n / 2 - 1;//(((4 * n) + 1) - (2 * fill) - (2 * dots)) / 3;
        // middle
        System.out.println(repeatStr(".", dots) +
                repeatStr("#", fill) + repeatStr(" ", space2) + "(@)" +
                repeatStr(" ", space2) + repeatStr("#", fill) +
                repeatStr(".", dots));

        dots += 1;
        fill -= 2;
        space += 2;
        for (int k = 0; k < n - (n / 2 + 1); k++) {
            System.out.println(repeatStr(".", dots) +
                    repeatStr("#", fill) +
                    repeatStr(" ", space) +
                    repeatStr("#", fill) +
                    repeatStr(".", dots));
            dots++;
            fill -= 2;
            space += 2;
        }
        int dots2 = n + 1;
        int fill2 = ((((4 * n) + 1) - 3)) / 2;
        //last part
        for (int j = 0; j < n; j++) {
            System.out.println(repeatStr(".", dots2) +
                    repeatStr("#", fill2) + repeatStr(".", dots2));
            dots2++;
            fill2 -= 2;
        }
        //String length = "###############";
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
