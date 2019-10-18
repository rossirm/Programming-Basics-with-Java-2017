import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        int z = Integer.parseInt(scan.nextLine());
        int workersNumber = Integer.parseInt(scan.nextLine());

        double totalGrapes = x * y;
        double wine = 0.4 * totalGrapes / 2.5;
         if (wine < z) {
             double result = z - wine;
             System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(result));
         } else {
             double result2 = (wine - z);
             double result3 = result2 / workersNumber;
             System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
             System.out.println();
             System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(result2), Math.ceil(result3));
         }
    }
}
/*
Втора задача от изпитa на 17 юли 2016. Тествайте решението си тук.
От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино. От 1 кв.м лозе се изкарват Y килограма грозде. За 1 литър вино са нужни 2,5 кг. грозде. Желаното количество вино за продан е Z литра.
Напишете програма, която пресмята колко вино може да се произведе и дали това количество е достатъчно. Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.
Вход
Входът се чете от конзолата и се състои от точно 4 реда, въведени от потребителя:
•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000];
•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00];
•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600];
•	4ти ред: брой работници – цяло число в интервала [1 … 20];
Изход
На конзолата трябва да се отпечата следното:
•	Ако произведеното вино е по-малко от нужното:
o	“It will be a tough winter! More {недостигащо вино} liters wine needed.”
	Резултатът трябва да е закръглен към по-ниско цяло число
•	Ако произведеното вино е повече от нужното:
o	“Good harvest this year! Total wine: {общо вино} liters.”
	Резултатът трябва да е закръглен към по-ниско цяло число
o	“{Оставащо вино} liters left -> {вино за 1 работник} liters per person.”
	И двата резултата трябва да са закръглени към по-високото цяло число
Примерен вход и изход
вход	изход	коментари
650
2
175
3	Good harvest this year! Total wine: 208 liters.
33 liters left -> 11 liters per person.	Общо грозде: 650 * 2 = 1 300
Вино = 40% * 1300 / 2,5 = 208
208 > 175
208 - 175 = 33 л остават -> 11 л на човек
1020
1.5
425
4	It will be a tough winter! More 180 liters wine needed.	Общо грозде: 1 020 * 1.5 = 1 530
Вино = 40% * 1 530 / 2,5 = 244.80
244.80 < 425
425 - 244.8 = 180.2 -> 180 л не достигат
 */