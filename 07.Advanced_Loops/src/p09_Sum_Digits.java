import java.util.Scanner;

public class p09_Sum_Digits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        do {
            sum += (n % 10);
            n = n / 10;
        } while (n > 0);
        System.out.println(sum);
    }
}
/*
Напишете програма, която чете цяло число num, въведено от потребителя, и отпечатва сумата от цифрите му.
Подсказка: в цикъл докато не стигнете до 0 сумирайте последната цифра на числото (num % 10) и го разделяйте след това на 10 (така изтривате последната му цифра).
 */