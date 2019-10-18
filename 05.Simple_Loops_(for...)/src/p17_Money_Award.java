import java.util.Scanner;

public class p17_Money_Award {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int partsOfProject = Integer.parseInt(scan.nextLine());
        double moneyForPoint = Double.parseDouble(scan.nextLine());
        double sum = 0.0;
        double result = 0.0;

        for (int i = 1; i <= partsOfProject; i++) {
            int totalPoints = Integer.parseInt(scan.nextLine());

            if (i % 2 == 0) {
                totalPoints *= 2;
            }
            sum += totalPoints;
        }
        System.out.printf("The project prize was %.2f lv.", sum * moneyForPoint);
    }
}
/*
Сашо, Пешо, Гошо, Иво и Стоян печелят състезание за най-добре изготвен проект и получават парична
награда. Проектът се разделя на части. Различните части на проекта, носят различен брой точки. За всяка
четна част (2, 4, 6…) има бонус – точките умножени по две. Да се напише програма, която пресмята каква
сума са получили участниците. От конзолата се прочита на колко части е разделен проектът, паричната
награда за всяка точка и колко точки се дават за всяка част.

Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
1. На колко части е разделен проектът – цяло число в интервала [1 … 50].
2. Паричната награда за една точка – реално число в интервала [0.00 … 10000.00].
За всяка част от проекта се прочита на отделен ред:
 Точките, които се получават – цяло число в интервала [0 … 100].

Изход
Отпечатва се 1 ред в следния формат:
 “The project prize was {сумата} lv.”.
Резултатът трябва да се форматира до втория знак след десетичната запетая.
 */