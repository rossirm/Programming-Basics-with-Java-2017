import java.util.Scanner;

public class p16_Profit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count1Lev = Integer.parseInt(scan.nextLine());
        int count2Lev = Integer.parseInt(scan.nextLine());
        int count5Lev = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= count1Lev; i++) {
            for (int j = 0; j <= count2Lev; j++) {
                for (int k = 0; k <= count5Lev; k++) {
                    if (i * 1 + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.",
                                i, j, k, sum);
                        System.out.println();
                        //System.out.println(count1Lev + " * 1 lv. + " + count2Lev
                        //+ " * 2 lv. + " + count5Lev + " * 5 lv. = " + sum + " lv.");
                    }

                }

            }
        }
    }
}
/*
Имаме банкноти и монети по 1лв., по 2лв. и по 5лв. Да се напише програма, която прочита въведените от потребителя брой банкноти и монети и сума, и извежда на екран всички възможни начини по които сумата може да се изплати с наличните банкноти.
Вход
Входът се чете от конзолата и съдържа точно 4 реда:
1.	Брой монети по 1лв. - цяло положително число;
2.	Брой монети по 2лв. - цяло положително число;
3.	Брой банкноти по 5лв. - цяло положително число;
4.	Сума - цяло положително число в интервала [1…1000];
Изход
Да се отпечатат на конзолата всички комбинации от дадените номинали, образуващи сумата, форматирани по следния начин:
o	"{бр. 1лв.} * 1 lv. + {бр. 2лв.} * 2 lv. + {бр. 5лв.} * 5 lv. = {сума} lv."
 */