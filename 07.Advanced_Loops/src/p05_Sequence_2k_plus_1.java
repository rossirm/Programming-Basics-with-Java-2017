import java.util.Scanner;

public class p05_Sequence_2k_plus_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int k = 1;
        while (k <= n) {
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
/*
Напишете програма, която чете число n, подадено от потребителя, и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, …. Всяко следващо число се изчислява като предишното число * 2 + 1.
 */