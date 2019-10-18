import com.sun.org.apache.regexp.internal.REProgram;

import java.util.Scanner;

public class p05_Square_Frame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("+ - - - - +".length());
        int n = Integer.parseInt(scan.nextLine());
        // first row
        String firstAndLastRow = "+" + repeatStr(" -", n-2) + " +";
        System.out.println(firstAndLastRow);

        // midlle part
        for (int i = 0; i < n-2; i++) {
            String mPart = "|" + repeatStr(" -", n - 2) + " |";
            System.out.println(mPart);
        }
        // last row
        System.out.println(firstAndLastRow);
    }
    public static String repeatStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }

        return result.toString();
    }
}
