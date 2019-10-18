import java.util.Scanner;

public class p03_Odd_Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (number % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
/*
Да се напише програма, която чете цяло число, въведено от потребителя, и печата дали е четно или нечетно.
 */