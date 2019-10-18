import java.util.Scanner;

public class p06_Rhombus_of_Stars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int upperAndDownRows = n - 1;

        for (int i = 0; i < upperAndDownRows; i++) {
            System.out.print(repeatStr(" ", upperAndDownRows - i) + "*");
            System.out.println(repeatStr(" *", i));
        }
        System.out.println(repeatStr("* ", n));

        for (int i = upperAndDownRows - 1; i >= 0; i--) {
            System.out.print(repeatStr(" ", upperAndDownRows - i) + "*");
            System.out.println(repeatStr(" *", i));
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
