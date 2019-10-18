import java.text.DecimalFormat;
import java.util.Scanner;

public class EXAMPLEs_with_METHOD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        //System.out.println(repeatStr(" -",n / 2 * 3 -4));
        StringBuilder a = new StringBuilder();
        //String a = "";
        for (int i = 0; i < n; i++) {
            a.append("*");
        }
        System.out.println(a);
         String b = "Rossi";
        b = b.equals("Rossi") ? "RM":"Maksimova";
        System.out.println(b);

        String c = scan.nextLine();
        if (c.equals("Rossi")) {
            c = "RM";
        } else {
            c = "Maksimova";
        }
        System.out.println(c);

        DecimalFormat format = new DecimalFormat("#,###");
        System.out.println(format.format(4.5039750830)); //??????????
    }

    public static String repeatStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }

        return result.toString();
    }
}
