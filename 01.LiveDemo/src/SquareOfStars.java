import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n - 2; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
