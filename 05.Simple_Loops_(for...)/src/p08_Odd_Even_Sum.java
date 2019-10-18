import java.util.Scanner;

public class p08_Odd_Even_Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.println("Sum =" + sumOdd);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumOdd - sumEven));
        }
    }
}
/*
Да се напише програма, която чете n-на брой цели числа, подадени от потребителя, и проверява дали
сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции. При равенство да се
отпечата &quot;Yes&quot; + сумата; иначе да се отпечата &quot;No&quot; + разликата. Разликата се изчислява по абсолютна
стойност.
Подсказки: Въведете числата едно по едно и изчислете двете суми (числа на четни позиции и числа на
нечетни позиции). Както в предходната задача, изчислете абсолютна стойност на разликата и отпечатайте
резултата (&quot;Yes&quot; + сумата при разлика 0 или &quot;No&quot; + разликата в противен случай).
 */