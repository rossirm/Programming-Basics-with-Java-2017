import java.util.Scanner;

public class CatTom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int restDays = Integer.parseInt(scan.nextLine());

        int workDays = 365 - restDays;
        int play = workDays * 63 + restDays * 127;
        int totalMinutes = 30000 - play;
        int hour = Math.abs(totalMinutes / 60);
        int mins = Math.abs(totalMinutes % 60);

        if (play > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hour, mins);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hour, mins);
        }
    }
}
/*
Котката Том обича по цял ден да спи, за негово съжаление стопанинът му си играе с него винаги когато  има свободно време. За да се наспи добре, нормата за игра на Том е 30 000  минути в година. Времето за игра на Том зависи от почивните дни на стопанина му:
•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
•	Когато почива, стопанинът му си играе с него  по 127 минути на ден.
Напишете програма, която чете броя почивни дни, въведени от потребителя, и отпечатва дали Том може да се наспи добре и колко е разликата от нормата за текущата година, като приемем че годината има 365 дни.
Пример: 20 почивни дни -> работните дни са 345 (365 – 20 = 245). Реалното време за игра е 24 275 минути (345 * 63 + 20 *127).  Разликата от нормата е 5 725 минути (30 000 – 24 275 = 5 725) или 95 часа и 25 минути.
Вход
Входът се чете от конзолата и се състои от едно число – броят почивни дни – цяло число в интервала [0...365]
Изход
На конзолата трябва да се отпечатат два реда.
•	Ако времето за игра на Том е над нормата за текущата година:
o	 На първия ред отпечатайте: “Tom will run away”
o	 На втория ред отпечатайте разликата от нормата във формат:
“{H} hours and {M} minutes more for play”
•	Ако времето за игра на Том е под нормата за текущата година:
o	На първия ред отпечатайте: “Tom sleeps well”
o	 На втория ред отпечатайте разликата от нормата във формат:
“{H} hours and {M} minutes less for play”
Примерен вход и изход
вход	изход	коментари
20	Tom sleeps well
95 hours and 25 minutes less for play	Почични дни: 20 * 127 = 2 540 минути игра
Работни дни: 365 - 20 = 345 * 63 = 21 735 минути игра
30 000 > 24 274 => остават 5725 мин = 95 часа и 25 мин
113	Tom will run away
3 hours and 47 minutes more for play	Почични дни: 113 * 127 = 14 351 минути
Работни дни: 365 - 113 = 252 * 63 = 15 876 минути
30 000 < 30 227 => 227 мин повече = 3 часа и 47 мин
 */