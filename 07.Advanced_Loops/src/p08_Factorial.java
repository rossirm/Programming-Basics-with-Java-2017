import java.util.Scanner;

public class p08_Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int factorial = 1;
        do {
            factorial = factorial * n;
            n--;
        } while (n > 1);
        System.out.println(factorial);
    }
}
/*
Напишете програма, която чете цяло число n (1 ≤ n ≤ 12), въведено от потребителя, и изчислява и отпечатва n! = 1 * 2 * … * n (n факториел).
 */