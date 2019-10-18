import java.util.Scanner;

public class p10_Half_Sum_Element {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int num = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            num = Integer.parseInt(scan.nextLine());
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        sum = sum - max;
        if (sum == max) {
            System.out.println("Yes sum = " + sum);
        } else {
            System.out.println("No Diff = " + Math.abs(sum - max));
        }
    }
}
/*
Да се напише програма, която чете n-на брой цели числа, въведени от потребителя, и проверява дали сред
тях съществува число, което е равно на сумата на всички останали. Ако има такъв елемент, печата &quot;Yes&quot;, &quot;Sum

© Фондация Софтуерен университет (softuni.org). Този документ използва лиценз CC-BY- NC-SA.
Следвай ни: Стр. 14 от 15
= &quot; + неговата стойност; иначе печата &quot;No&quot;, &quot;Diff = &quot; + разликата между най-големия елемент и сумата на
останалите (по абсолютна стойност).
Подсказка: изчислете сумата на всички елементи и най-големият от тях и проверете търсеното условие.
 */