import java.util.Scanner;

public class p07_Greatest_Common_Divisor___CGD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        while (b != 0) {
            int lastB = b;
            b = a % b;
            a = lastB;
        }
        System.out.println(a);
    }
}
/*
Напишете програма, която чете две цели положителни числа a и b, въведени от потребителя, и изчислява и отпечатва най-големият им общ делител (НОД).
 */