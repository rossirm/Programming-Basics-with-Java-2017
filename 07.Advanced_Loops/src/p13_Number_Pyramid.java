import java.util.Scanner;

public class p13_Number_Pyramid {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (count <= n) {
                    System.out.print(count + " ");
                    count++;
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }
}
/*
Напишете програма, която чете цяло число n, въведено от потребителя, и отпечатва пирамида от числа като в примерите:
Подсказка:
•	С два вложени цикъла печатайте пирамида от числа: на първия ред едно число, на втория ред 2 числа, на третия ред 3 числа и т.н.
•	В отделен брояч пазете колко числа сте отпечатали до момента (и кое е текущото число). Когато стигнете n, излезте внимателно от двата вложени цикъла с break или return.
 */