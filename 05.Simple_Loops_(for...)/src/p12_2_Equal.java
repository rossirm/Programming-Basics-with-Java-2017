import java.util.Scanner;

public class p12_2_Equal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numPairs = Integer.parseInt(scan.nextLine());
        int previousSum = 0;
        int difference = 0;


        for (int i = 1; i <= numPairs; i++) {
            if (i == 1) {
                int firstNum = Integer.parseInt(scan.nextLine());
                int secondNum = Integer.parseInt(scan.nextLine());
                previousSum = firstNum + secondNum;
            } else {
                int firstNum2 = Integer.parseInt(scan.nextLine());
                int secondNum2 = Integer.parseInt(scan.nextLine());
                int currentSum = firstNum2 + secondNum2;

                if ((Math.abs(currentSum - previousSum)) > difference) {
                    difference = Math.abs(currentSum - previousSum);

                }
                previousSum = currentSum;
            }
        }

        if (difference > 0) {
            System.out.println("No, maxdiff=" + difference);
        } else {
            System.out.println("Yes, value=" + previousSum);
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
