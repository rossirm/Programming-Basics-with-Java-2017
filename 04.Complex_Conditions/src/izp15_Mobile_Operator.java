import java.util.Scanner;

public class izp15_Mobile_Operator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String term = scan.nextLine().toLowerCase();
        String type = scan.nextLine();
        String internet = scan.nextLine().toLowerCase();
        int months = Integer.parseInt(scan.nextLine());
        double result1 = 0.0;
        double result2 = 0.0;
        double result3 = 0.0;

        if (term.equals("one")) {
            if ((type.equals("Small") && (internet.equals("no")))) {
                result1 = 9.98 * months;
                System.out.printf("%.2f lv.", result1);
            } else if ((type.equals("Small") && (internet.equals("yes")))) {
                result1 = 9.98;
                if (result1 <= 10.00) {
                    System.out.printf("%.2f lv.", (result1 + 5.50) * months);
                } else if (result1 <= 30.00) {
                    System.out.printf("%.2f lv.", (result1 + 4.35) * months);
                } else if (result1 > 30.00) {
                    System.out.printf("%.2f lv.", (result1 + 3.85) * months);
                }
            } else if ((type.equals("Middle") && (internet.equals("no")))) {
                result1 = 18.99 * months;
                System.out.printf("%.2f lv.", result1);
            } else if ((type.equals("Middle") && (internet.equals("yes")))) {
                result1 = 18.99;
                if (result1 <= 10.00) {
                    System.out.printf("%.2f lv.", (result1 + 5.50) * months);
                } else if (result1 <= 30.00) {
                    System.out.printf("%.2f lv.", (result1 + 4.35) * months);
                } else if (result1 > 30.00) {
                    System.out.printf("%.2f lv.", (result1 + 3.85) * months);
                }
            } else if ((type.equals("Large") && (internet.equals("no")))) {
                result1 = 25.98 * months;
                System.out.printf("%.2f lv.", result1);
            } else if ((type.equals("Large") && (internet.equals("yes")))) {
                result1 = 25.98;
                if (result1 <= 10.00) {
                    System.out.printf("%.2f lv.", (result1 + 5.50) * months);
                } else if (result1 <= 30.00) {
                    System.out.printf("%.2f lv.", (result1 + 4.35) * months);
                } else if (result1 > 30.00) {
                    System.out.printf("%.2f lv.", (result1 + 3.85) * months);
                }
            } else if ((type.equals("ExtraLarge") && (internet.equals("no")))) {
                result1 = 35.99 * months;
                System.out.printf("%.2f lv.", result1);
            } else if ((type.equals("ExtraLarge") && (internet.equals("yes")))) {
                result1 = 35.99;
                if (result1 <= 10.00) {
                    System.out.printf("%.2f lv.", (result1 + 5.50) * months);
                } else if (result1 <= 30.00) {
                    System.out.printf("%.2f lv.", (result1 + 4.35) * months);
                } else if (result1 > 30.00) {
                    System.out.printf("%.2f lv.", (result1 + 3.85) * months);
                }
            }
        } else if (term.equals("two")) {
            if ((type.equals("Small") && (internet.equals("no")))) {
                result1 = 8.58;
                result2 = result1 * 0.0375;
                result3 = (result1 - result2) * months;
                System.out.printf("%.2f lv.", result3);
            } else if ((type.equals("Small") && (internet.equals("yes")))) {
                result1 = 8.58;
                if (result1 <= 10.00) {
                    result2 = ((result1 + 5.50) * months) * 0.0375;
                    result3 = (((result1 + 5.50) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                } else if (result1 <= 30.00) {
                    result2 = ((result1 + 4.35) * months) * 0.0375;
                    result3 = (((result1 + 4.35) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                } else if (result1 > 30.00) {
                    result2 = ((result1 + 3.85) * months) * 0.0375;
                    result3 = (((result1 + 3.85) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                }
            } else if ((type.equals("Middle") && (internet.equals("no")))) {
                result1 = 17.09;
                result2 = result1 * 0.0375;
                result3 = (result1 - result2) * months;
                System.out.printf("%.2f lv.", result3);
            } else if ((type.equals("Middle") && (internet.equals("yes")))) {
                result1 = 17.09;
                if (result1 <= 10.00) {
                    result2 = ((result1 + 5.50) * months) * 0.0375;
                    result3 = (((result1 + 5.50) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                } else if (result1 <= 30.00) {
                    result2 = ((result1 + 4.35) * months) * 0.0375;
                    result3 = (((result1 + 4.35) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                } else if (result1 > 30.00) {
                    result2 = ((result1 + 3.85) * months) * 0.0375;
                    result3 = (((result1 + 3.85) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                }
            } else if ((type.equals("Large") && (internet.equals("no")))) {
                result1 = 23.59;
                result2 = result1 * 0.0375;
                result3 = (result1 - result2) * months;
                System.out.printf("%.2f lv.", result3);
            } else if ((type.equals("Large") && (internet.equals("yes")))) {
                result1 = 23.59;
                if (result1 <= 10.00) {
                    result2 = ((result1 + 5.50) * months) * 0.0375;
                    result3 = (((result1 + 5.50) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                } else if (result1 <= 30.00) {
                    result2 = ((result1 + 4.35) * months) * 0.0375;
                    result3 = (((result1 + 4.35) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                } else if (result1 > 30.00) {
                    result2 = ((result1 + 3.85) * months) * 0.0375;
                    result3 = (((result1 + 3.85) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                }
            } else if ((type.equals("ExtraLarge") && (internet.equals("no")))) {
                result1 = 31.79;
                result2 = result1 * 0.0375;
                result3 = (result1 - result2) * months;
                System.out.printf("%.2f lv.", result3);
            } else if ((type.equals("ExtraLarge") && (internet.equals("yes")))) {
                result1 = 31.79;
                if (result1 <= 10.00) {
                    result2 = ((result1 + 5.50) * months) * 0.0375;
                    result3 = (((result1 + 5.50) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                } else if (result1 <= 30.00) {
                    result2 = ((result1 + 4.35) * months) * 0.0375;
                    result3 = (((result1 + 4.35) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                } else if (result1 > 30.00) {
                    result2 = ((result1 + 3.85) * months) * 0.0375;
                    result3 = (((result1 + 3.85) * months) - result2);
                    System.out.printf("%.2f lv.", result3);
                }
            }
        }
    }
}
/*
Мобилен оператор предлага договори с различна месечна такса в зависимост от срока - 1 или 2 години. Да се
напише програма, която изчислява дължимата сума, която трябва да се плати за определен брой месеци.
срок / тип Small Middle Large ExtraLarge
1 година 9.98 лв. 18.99 лв. 25.98 лв. 35.99 лв.
2 години 8.58 лв. 17.09 лв. 23.59 лв. 31.79 лв.
Условия:
 при добавен мобилен интернет, към таксата се добавя:
 при сума по-малка или равна от 10.00 лв.  5.50 лв.
 при сума по-малка или равна от 30.00 лв.  4.35 лв.
 при сума по-голяма от 30.00 лв.  3.85 лв.
 ако договорът за две години, общата сума се намалява с 3.75%

© Фондация Софтуерен университет (softuni.org). Този документ използва лиценз CC-BY- NC-SA.
Следвай ни: Стр. 17 от 18

Вход
От конзолата се четат 3 реда:
1. срок на договор – текст - “one”, или “two”
2. тип на договор – текст - “Small”, “Middle”, “Large”или “ExtraLarge”;
3. добавен интернет – текст - “yes”, или “no”
4. брой месеци за плащане - цяло число в интервала [1 … 24];
Изход
На конзолата се отпечатва 1 ред:

 Цената, която заплаща клиентът, форматирана до втория знак след десетичната
запетая, в следния формат: &quot;{цената} lv.“
 */