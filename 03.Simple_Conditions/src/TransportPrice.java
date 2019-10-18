import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        if (n < 20 && day.equals("day")) {
            double price = 0.70 + n * 0.79;
            System.out.printf("%.2f", price);
        } else if (n < 20 && day.equals("night")) {
            double price = 0.70 + n * 0.90;
            System.out.printf("%.2f", price);
        } else if (n >= 20 && n < 100 && day.equals("day")) {
            double price = n * 0.09;
            System.out.printf("%.2f", price);
        } else if (n >= 20 && n < 100 && day.equals("night")) {
            double price = n * 0.09;
            System.out.printf("%.2f", price);
        } else if (n >= 100 && day.equals("day")) {
            double price = n * 0.06;
            System.out.printf("%.2f", price);
        } else if (n >= 100 && day.equals("night")) {
            double price = n * 0.06;
            System.out.printf("%.2f", price);
        }
    }
}
/*
Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:
 Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
 Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
 Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
Напишете програма, която чете броя километри n и период от деня (ден или нощ), въведени от потребителя,
и изчислява цената на най-евтиния транспорт.
Вход
От конзолата се четат два реда:
 Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000].
 Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта.
Изход
Да се отпечата на конзолата най-ниската цена за посочения брой километри. Резултатът да се форматира до
втория знак след десетичната запетая.
Примерен вход и изход
Вход Изход Обяснения
5
day
4.65 Разстоянието е под 20 км  може да се ползва само такси. Началната такса е 0.70 лв.
Понеже е през деня, тарифата е 0.79 лв. / км. С такси цената е: 0.70 + 5 * 0.79 = 4.65 лв.

7
night
7.00 Разстоянието е под 20 км  може да се ползва само такси. Началната такса е 0.70 лв.
Понеже е през нощта, тарифата е 0.90 лв. / км. С такси цената е: 0.70 + 7 * 0.90 = 7.00 лв.

25
day
2.25 Разстоянието е над 20 км  може да се ползва автобус, но не може да се ползва влак.
Автобусът е най-евтиния възможен вариант. С автобус цената е: 25 * 0.09 = 2.25 лв.

180
night
10.80 Разстоянието е над 100 км  може да се ползва влак. Влакът е най-евтиният възможен
вариант за пътуване. С влак цената е: 180 * 0.06 = 10.80 лв.
 */