import java.util.Scanner;

public class p10_Check_Prime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        boolean prime = true;

        if (n < 2) {
            System.out.println("Not prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
/*
Напишете програма, която чете цяло число n, въведено от потребителя, и проверява дали е просто число (дали се дели само на себе си и на единица). Да се отпечата “Prime” или “Not prime”.
Подсказки:
•	Ако числото е по-малко от 2, значи не е просто.
•	Всяко друго число първоначално се приема за просто и се проверява в цикъл дали се дели на числата 2, 3, 4, …, до корен квадратен от n (цялата част).
 */