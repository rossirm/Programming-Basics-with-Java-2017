import java.util.Scanner;

public class p03_Powers_of_Two {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num = 1;

        for (int i = 0; i <=n ; i++) {
            System.out.println(num);
            num *= 2;
        }
    }
}
/*
Напишете програма, която чете от конзолата цяло число n, въведено от потребителя, и печата числата от 1 до 2n.
 */