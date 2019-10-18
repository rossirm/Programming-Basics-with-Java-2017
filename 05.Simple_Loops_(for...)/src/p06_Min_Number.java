import java.util.Scanner;

public class p06_Min_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num < max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
/*
Напишете програма, която чете n-на брой цели числа (n &gt; 0), въведени от потребителя, и намира най-
малкото измежду тях. Първо се въвежда броят числа n, а след това самите n числа, по едно на ред.
*/