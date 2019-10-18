import java.util.Scanner;

public class p03_Square_of_stars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
