import java.util.Scanner;

public class Demo_fori_in_fori {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("i: %d => j: %d%n", i, j);
            }
        }
    }
}
