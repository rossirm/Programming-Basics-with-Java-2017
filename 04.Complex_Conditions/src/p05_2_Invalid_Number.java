import java.util.Scanner;

public class p05_2_Invalid_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        boolean isValid = number >= 100 && number <= 200 || number == 0;

        if (!isValid) {
            System.out.println("invalid");
        }
    }
}
/*
Дадено число е валидно, ако е в диапазона [100…200] или е 0. Да се напише програма, която чете цяло
число, въведено от потребителя, и печата „invalid“ ако въведеното число не е валидно. Примери:
 */