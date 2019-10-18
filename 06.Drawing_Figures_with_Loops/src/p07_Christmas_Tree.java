import java.util.Scanner;

public class p07_Christmas_Tree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n; i++) {
            System.out.println(repeatStr(" ", n - i) +
                    repeatStr("*",i) + " | "
                    + repeatStr("*",i) +
                    repeatStr(" ", n - i));
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

