import java.util.Scanner;

public class p04_GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        if (first > second) {
            System.out.printf("Greater number: " + first);
        }
        else {
            System.out.printf("Greater number: " + second);

        }
    }
}
/*
Да се напише програма, която чете две цели числа, въведени от потребителя, и отпечатва по-голямото от
двете.
 */