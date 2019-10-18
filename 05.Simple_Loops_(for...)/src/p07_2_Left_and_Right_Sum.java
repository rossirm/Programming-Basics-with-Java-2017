import java.util.Scanner;

public class p07_2_Left_and_Right_Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int readCount = 2 * n;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < readCount; i++) {
            if (i < n) {
                int num = Integer.parseInt(scan.nextLine());
                leftSum += num;
            } else {
                int num = Integer.parseInt(scan.nextLine());
                rightSum += num;
                if (leftSum != rightSum) {
                    System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
                    /*System.out.printf("No, diff = %d",
                            Math.max(leftSum, rightSum) - Math.min(leftSum, rightSum));
                            */
                } else {
                    System.out.println("Yes, sum = " + leftSum);
                }
            }
        }

    }
}
/*
Да се напише програма, която чете 2*n-на брой цели числа, подадени от потребителя, и проверява дали
сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума). При равенство
печата &quot;Yes&quot; + сумата; иначе печата &quot;No&quot; + разликата. Разликата се изчислява като положително число (по
абсолютна стойност).
Подсказки:
 Въведете n.
 Въведете първите n числа (лявата половина) и ги сумирайте.
 Въведете още n числа (дясната половина) и ги сумирайте.

© Фондация Софтуерен университет (softuni.org). Този документ използва лиценз CC-BY- NC-SA.
Следвай ни: Стр. 14 от 15
 Изчислете разликата между сумите по абсолютна стойност: Math.Abs(leftSum - rightSum).
 Ако разликата е 0, отпечатайте &quot;Yes&quot; + сумата; иначе отпечатайте &quot;No&quot; + разликата.
 */