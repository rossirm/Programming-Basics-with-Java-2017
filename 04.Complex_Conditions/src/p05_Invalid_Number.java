import java.util.Scanner;

public class p05_Invalid_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (number != 100 && number < 100 && number != 0) {
            System.out.println("invalid");
        } else if (number != 200 && number > 200) {
            System.out.println("invalid");
        }
    }
}
/*
Дадено число е валидно, ако е в диапазона [100…200] или е 0. Да се напише програма, която чете цяло
число, въведено от потребителя, и печата „invalid“ ако въведеното число не е валидно. Примери:
 */