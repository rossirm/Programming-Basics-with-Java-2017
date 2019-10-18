import java.util.Scanner;

public class p02_Numbers_N_to_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
/*
Напишете програма, която чете цяло положително число n, въведено от потребителя, и печата числата от n до 1 в обратен ред (от най-голямото към най-малкото).
 */