import java.util.Scanner;

public class p01_LoopByStep3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("n = ");

        int n = Integer.parseInt(scan.nextLine());

        System.out.println("The numbers are: ");

        for (int i = 1; i <= n ; i+=3) {
            System.out.println(i);
        }
    }
}
/*
Напишете програма, която чете число n, въведено от потребителя, и отпечатва числата от 1 до n през 3 (със стъпка 3).
 */