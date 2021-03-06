import java.util.Scanner;

public class p04_Sum_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum = sum + num;
        }
            System.out.println(sum);

    }
}
/*
Да се напише програма, която чете n-на брой цели числа, въведени от потребителя, и ги сумира.
 От първия ред на входа се въвежда броят числа n.
 От следващите n реда се въвежда по едно цяло число.
Програмата трябва да прочете числата, да ги сумира и да отпечата сумата им.
Подсказки:
 Първо въведете едно число n (броят числа, които предстои да бъдат въведени).
 Инициализирайте sum = 0 (в началото няма още прочетени числа, и съответно сумата е празна).
 В цикъл n пъти прочетете по едно цяло число num и го прибавете към сумата (sum = sum + num).
 Накрая в sum трябва да се е запазила сумата на прочетените числа. Отпечатайте я.
 */