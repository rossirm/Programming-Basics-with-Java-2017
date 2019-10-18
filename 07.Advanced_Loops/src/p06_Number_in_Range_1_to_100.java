import java.util.Scanner;

public class p06_Number_in_Range_1_to_100 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number in the range [1...100]: ");
        int n = Integer.parseInt(scan.nextLine());

        while (n < 1 || n > 100) {
            System.out.println("Invalid number!");
            n = Integer.parseInt(scan.nextLine());
        }
        System.out.println("The number is: " + n);
    }
}
/*
Напишете програма, която чете цяло положително число n в диапазона [1…100], въведено от потребителя. При въвеждане на число извън посочения диапазон, да се отпечата съобщение за грешка и потребителят да се подкани да въведе ново число.
 */