import java.util.Scanner;

public class p12_Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int f0 = 1;
        int f1 = 1;
        for (int i = 0; i < n - 1; i++) {
            int fNextSum = f0 + f1;
            f0 = f1;
            f1 = fNextSum;
        }
        System.out.println(f1);
    }
}
/*
Напишете програма, която чете цяло число n, въведено от потребителя, и пресмята n-тото число на Фибоначи. Нулевото число на Фибоначи е 1, първото е също 1, а всяко следващо е сумата от предходните две.
Подсказка:
•	При n < 2 отпечатайте 1.
•	Започнете от f0=1 и f1=1 и в цикъл сумирайте последните две числа. Записвайте последните две числа след всяка стъпка в f0 и f1.
 */