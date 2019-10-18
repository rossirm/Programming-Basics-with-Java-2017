import java.util.Scanner;

public class p12_Equal_Pairs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int currSum = 0;
        int prevSum = 0;
        int differ = 0;
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            prevSum = currSum;
            currSum = 0;
            currSum += Integer.parseInt(scan.nextLine());
            currSum += Integer.parseInt(scan.nextLine());
            if (i != 0) {
                differ = Math.abs(currSum - prevSum);
                if (differ != 0 && differ > maxDiff) {
                    maxDiff = differ;
                }
            }

        }
        if (prevSum == currSum || n == 1) {
            System.out.printf("Yes, value = %.0d", currSum);
        } else {
            System.out.printf("No, maxdiff = %.0d", maxDiff);
        }
    }
}
/*
Дадени са 2*n-на брой числа. Първото и второто формират двойка, третото и четвъртото също и т.н. Всяка
двойка има стойност – сумата от съставящите я числа. Напишете програма, която проверява дали всички
двойки имат еднаква стойност или печата максималната разлика между две последователни двойки. Ако
всички двойки имат еднаква стойност, отпечатайте &quot;Yes, value={Value}&quot; + стойността. В противен случай
отпечатайте &quot;No, maxdiff={Difference}&quot; + максималната разлика.
Подсказки:
 Прочитайте входните числа по двойки. За всяка двойка пресмятайте сумата.
 Докато четете входните двойки, за всяка двойка без първата пресмятайте разликата с предходната.
За целта пазете в отделна променлива сумата на предходната двойка.
 Намерете най-голямата разлика между две двойки. Ако е 0, печатайте “Yes” иначе “No” + разликата.
 */

