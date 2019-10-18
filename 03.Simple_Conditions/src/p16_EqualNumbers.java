import java.util.Scanner;

public class p16_EqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        if (first == second && first == third) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
// Да се въведат 3 числа и да се отпечата дали са еднакви (yes / no)