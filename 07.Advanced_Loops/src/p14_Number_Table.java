import java.util.Scanner;

public class p14_Number_Table {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int num = row + col + 1;
                if (num > n) {
                    num = 2 * n - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}