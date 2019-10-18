import java.util.Scanner;

public class izp18_Final_Contest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfDancers = Integer.parseInt(scan.nextLine());
        double points = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();
        String country = scan.nextLine();


        double money = 0.0;
        double money2 = 0.0;
        double moneyForCharity = 0.0;
        double moneyFPerDancer = 0.0;

        switch (country) {
            case "Bulgaria":
                money = numberOfDancers * points;
                switch (season) {
                    case "summer":
                        money2 = money - (money * 0.05);
                        moneyForCharity = money2 * 0.75;
                        moneyFPerDancer = (money2 - moneyForCharity) / numberOfDancers;
                        System.out.printf("Charity - %.2f", moneyForCharity);
                        System.out.println();
                        System.out.printf("Money per dancer - %.2f", moneyFPerDancer);
                        break;
                    case "winter":
                        money2 = money - (money * 0.08);
                        moneyForCharity = money2 * 0.75;
                        moneyFPerDancer = (money2 - moneyForCharity) / numberOfDancers;
                        System.out.printf("Charity - %.2f", moneyForCharity);
                        System.out.println();
                        System.out.printf("Money per dancer - %.2f", moneyFPerDancer);
                        break;
                        default:
                            break;
                }
                break;
            case "Abroad":
                money = numberOfDancers * points + (numberOfDancers * points * 0.5);
                switch (season) {
                    case "summer":
                        money2 = money - (money * 0.1);
                        moneyForCharity = money2 * 0.75;
                        moneyFPerDancer = (money2 - moneyForCharity) / numberOfDancers;
                        System.out.printf("Charity - %.2f", moneyForCharity);
                        System.out.println();
                        System.out.printf("Money per dancer - %.2f", moneyFPerDancer);
                        break;
                    case "winter":
                        money2 = money - (money * 0.15);
                        moneyForCharity = money2 * 0.75;
                        moneyFPerDancer = (money2 - moneyForCharity) / numberOfDancers;
                        System.out.printf("Charity - %.2f", moneyForCharity);
                        System.out.println();
                        System.out.printf("Money per dancer - %.2f", moneyFPerDancer);
                        break;
                }
                break;
                default:
                    break;
        }
    }
}
/*
След успешно класиране групата заминава за финалното състезание. След представяне всяка група получава
парична награда. Тя зависи от това, дали финалът е в България или в чужбина, от броя точки, които журито е
дало и сезона през който се е провело състезанието.
 Ако състезанието се е провело в България паричната награда се изчислява като се умножат точките
по броя участниците.
 Ако се е провело в чужбина – се умножават броя участници по броя точки и към тях се добавя 50% от
получената сума.
От получената сума се изваждат разходите посочени в проценти спрямо сезона който се е провел :

Лято Зима
България 5% 8%
Чужбина 10% 15%



След завръщането си групата дарява 75% от сумата, след приспаднатите разходи, за благотворителност, а
останалата сума се разпределя между членовете на групата.
Да се напише програма, която изчислява колко пари са дадени за благотворителност и колко е получил
всеки един член на групата.

© Фондация Софтуерен университет (softuni.org). Този документ използва лиценз CC-BY- NC-SA.
Следвай ни: Стр. 17 от 18

Вход
От конзолата се четат 4 реда:
8. Брой танцьори – цяло число в интервала [1…10];
9. Брой точки – реално число в интервала [1.00…10000.00];
10. Сезон – ”summer“ / “winter“;
11. Място – „Bulgaria“ / „Abroad“;
Изход
На конзолата се отпечатват 2 реда:
 Сумата, която са дали за благотворителност, форматирана до втория знак след десетичната запетая
„Charity - {обща сума}“
 Сумата, която е получил един танцьор, форматирана до втория знак след десетичната запетая
„Money per dancer - {сума}“
 */