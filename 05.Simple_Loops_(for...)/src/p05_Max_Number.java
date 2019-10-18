import java.util.Scanner;

public class p05_Max_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
/*
Напишете програма, която чете n-на брой цели числа (n &gt; 0), въведени от потребителя, и намира най-
голямото измежду тях. Първо се въвежда броят числа n, а след това самите n числа, по едно на ред.
Подсказки:
 Първо въведете едно число n (броят числа, които предстои да бъдат въведени).
 Въведете от конзолата първото число. Сложете текущият максимум max да е прочетеното число.
 В цикъл n-1 пъти прочетете по едно цяло число num. Ако прочетеното число num е по-голямо от
текущият максимум max, запомнете num в max.
 Накрая в max трябва да се е запазило най-голямото число. Отпечатайте го.
 */