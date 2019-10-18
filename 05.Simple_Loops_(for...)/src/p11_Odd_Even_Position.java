import java.text.DecimalFormat;
import java.util.Scanner;

public class p11_Odd_Even_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double OddSum = 0.00;
        double EvenSum = 0.00;
        double OddMin = 1000000000.0;
        double EvenMin = 1000000000.0;
        double OddMax = -1000000000.0;
        double EvenMax = -1000000000.0;
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 1; i <= number; i++) {
            double digit = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {    //Even numbers
                EvenSum += digit;
                if (digit > EvenMax) {
                    EvenMax = digit;
                }
                if (digit < EvenMin) {
                    EvenMin = digit;
                }
            } else { //Odd numbers
                OddSum += digit;
                if (digit > OddMax) {
                    OddMax = digit;
                }
                if (digit < OddMin) {
                    OddMin = digit;
                }
            }
        }
        System.out.println("OddSum=" + df.format(OddSum));
        if (OddMin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.println("OddMin=%" + df.format(OddMin));
        }
        if (OddMax == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=" + df.format(OddMax));
        }
        System.out.println("EvenSum=" + df.format(EvenSum));

        if (EvenMin == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.println("EvenMin=" + df.format(EvenMin));
        }
        if (EvenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.println("EvenMax=" + df.format(EvenMax));
        }
    }
}
/*
Напишете програма, която чете n-на брой числа, въведени от потребителя, и пресмята сумата, минимума и
максимума на числата на четни и нечетни позиции (броим от 1). Когато няма минимален / максимален
елемент, отпечатайте “No”.
Изходът да се форматира в следния вид:
&quot;OddSum=&quot; + {сума на числата на нечетни позиции},
&quot;OddMin=&quot; + { минимална стойност на числата на нечетни позиции } / {“No”},
&quot;OddMax=&quot; + { максимална стойност на числата на нечетни позиции } / {“No”},
&quot;EvenSum=&quot; + { сума на числата на четни позиции },
&quot;EvenMin=&quot; + { минимална стойност на числата на четни позиции } / {“No”},
&quot;EvenMax=&quot; + { максимална стойност на числата на четни позиции } / {“No”}
Подсказки:
 Задача обединява няколко предходни задачи: намиране на минимум, намиране на максимум,
намиране на сума и обработка на елементите от четни и нечетни позиции. Припомнете си ги.
 Работете с дробни числа (не цели). Сумата, минимумът и максимумът също са дробни числа.
 Използвайте неутрална начална стойност при намиране на минимум / максимум, например
1000000000.0 и -1000000000.0. Ако получите накрая неутралната стойност, печатайте “No”.
 */