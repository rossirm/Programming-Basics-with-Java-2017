import java.util.Scanner;

public class p12_Sheriff {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String firstLine = repeatStr(".", (n * 3 - 1) / 2) + "x" + repeatStr(".", (n * 3 - 1) / 2);
        System.out.println(firstLine);
        String secondLine = repeatStr(".", (n * 3 - 3) / 2) + "/x\\" + repeatStr(".", (n * 3 - 3) / 2);
        System.out.println(secondLine);
        String tirthLine = repeatStr(".", (n * 3 - 3) / 2) + "x|x" + repeatStr(".", (n * 3 - 3) / 2);
        System.out.println(tirthLine);
        for (int i = 0; i < (n - 1) / 2; i++) {
            String cycle = repeatStr(".", (n * 3 - 1) / 2 - n - i) + repeatStr("x", n + i)
                    + "|"
                    + repeatStr("x", n + i)
                    + repeatStr(".", (n * 3 - 1) / 2 - n - i);
            System.out.println(cycle);
        }
        String middle = repeatStr("x", (n*3-1)/2) + "|" + repeatStr("x", (n*3-1)/2);
        System.out.println(middle);
        for (int i = 0; i < (n - 1) / 2 ; i++) {
            String cycleReverse = repeatStr(".", 1 + i) + repeatStr("x", (n*3 - 3)/2 - i)
                    + "|"
                    + repeatStr("x", (n*3 - 3)/2 - i)
                    + repeatStr(".", 1 + i);
            System.out.println(cycleReverse);
        }
        System.out.println(secondLine);
        String secondLineMirrored = repeatStr(".", (n * 3 - 3) / 2) + "\\x/" + repeatStr(".", (n * 3 - 3) / 2);
        System.out.println(secondLineMirrored);
        for (int i = 0; i < (n - 1) / 2; i++) {
            String cycle = repeatStr(".", (n * 3 - 1) / 2 - n - i) + repeatStr("x", n + i)
                    + "|"
                    + repeatStr("x", n + i)
                    + repeatStr(".", (n * 3 - 1) / 2 - n - i);
            System.out.println(cycle);
        }
        System.out.println(middle);
        for (int i = 0; i < (n - 1) / 2 ; i++) {
            String cycleReverse = repeatStr(".", 1 + i) + repeatStr("x", (n*3 - 3)/2 - i)
                    + "|"
                    + repeatStr("x", (n*3 - 3)/2 - i)
                    + repeatStr(".", 1 + i);
            System.out.println(cycleReverse);
        }
        System.out.println(tirthLine);
        System.out.println(secondLineMirrored);
        System.out.println(firstLine);
    }

    public static String repeatStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
