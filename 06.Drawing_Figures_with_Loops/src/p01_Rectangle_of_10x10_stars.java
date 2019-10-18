import java.util.Scanner;

public class p01_Rectangle_of_10x10_stars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = 10;

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
