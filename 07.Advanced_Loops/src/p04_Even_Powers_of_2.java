import java.util.Scanner;

public class p04_Even_Powers_of_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
int num = 1;
        for (int i = 0; i <= n; i+=2) {
            System.out.println(num);
            num *= 4;
        }
    }
}
/*
Да се напише програма, която чете число n, въведено от потребителя, и печата четните степени на 2 ≤ 2n: 20, 22, 24, 28, …, 2n.
 */