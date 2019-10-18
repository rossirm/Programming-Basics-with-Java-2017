import java.util.Scanner;

public class p16_Enrgy_Loss {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int a = Integer.parseInt(scan.nextLine());
        int startEnergy = n * a * 100;

        double stayEnergy = 0.0;
        double stayDancer = (stayEnergy / a) / n;
        double energyDay1 = 0.0;
        double energyDay2 = 0.0;
        double energyDay3 = 0.0;
        double energyDay4 = 0.0;
        double sum = 0.0;

        for (int i = 1; i < n + 1; i++) {
            int hours = Integer.parseInt(scan.nextLine());

            if (i % 2 == 0 && hours % 2 == 0) {
                energyDay1 = 68 * a;
                sum += energyDay1;
            } else if (i % 2 == 0 && hours % 2 != 0) {
                energyDay2 = 65 * a;
                sum += energyDay2;
            } else if (i % 2 != 0 && hours % 2 != 0) {
                energyDay3 = 30 * a;
                sum += energyDay3;
            } else if (i % 2 != 0 && hours % 2 == 0) {
                energyDay4 = 49 * a;
                sum += energyDay4;
            }
            stayEnergy = startEnergy - (sum);
            stayDancer = (stayEnergy / a) / n;
        }
        if ((100 - stayDancer) <= 50) {
            System.out.printf("They feel good! Energy left: %.2f", stayDancer);
        } else if ((100 - stayDancer) > 50) {
            System.out.printf("They are wasted! Energy left: %.2f", stayDancer);
        }
    }
}
/*
След финалите всички танцьори се връщат към регулярните си тренировки в залата. Всички тренират
определен брой дни по определени часове. Да се изчисли колко средно енергия е останала неизхабена за
всички тренировъчни дни като се има предвид че:


Проценти изхабена енергия
на човек
Четна тренировка и четни часове 68%
Нечетна тренировка и четни часове 49%
Четна тренировка и нечетни часове 65%
Нечетна тренировка и нечетни часове 30%

Всеки танцьор започва със 100% енергия.
Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
1. N – брой тренировъчни дни – цяло число в интервала [0 … 31].
2. А – брой танцьори – цяло число в интервала [0 … 100].
За всеки тренировъчен ден се прочита на отделен ред:
 Часовете, които са тренирали – цяло число в интервала [0 … 12].
Изход
Отпечатва се 1 ред в следния формат:
АКО средния разход на енергия за тренировъчните дни е 50% или по - малко
 “They feel good! Energy left: {останала енергия}”.
AКО средния разход на енергия за тренировъчните дни е над 50%
 “They are wasted! Energy left: {останала енергия}”.

Резултатът трябва да се форматира до втория знак след десетичната запетая.
 */