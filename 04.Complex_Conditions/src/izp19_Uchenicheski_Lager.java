import java.util.Scanner;

public class izp19_Uchenicheski_Lager {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        String groupType = scan.nextLine().toLowerCase();
        int studentNumber = Integer.parseInt(scan.nextLine());
        int sleepNumber = Integer.parseInt(scan.nextLine());

        double price = 0.0;
        String sport = null;

        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "girls":
                        sport = "Gymnastics";
                        price = studentNumber * 9.6 * sleepNumber;
                        if (studentNumber >= 10 && studentNumber < 20) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.95);
                        } else if (studentNumber >= 20 && studentNumber < 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.85);
                        } else if (studentNumber >= 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.5);
                        } else {
                            System.out.printf("%s %.2f lv.", sport, price);
                        }
                        break;
                    case "boys":
                        sport = "Judo";
                        price = studentNumber * 9.6 * sleepNumber;
                        if (studentNumber >= 10 && studentNumber < 20) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.95);
                        } else if (studentNumber >= 20 && studentNumber < 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.85);
                        } else if (studentNumber >= 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.5);
                        } else {
                            System.out.printf("%s %.2f lv.", sport, price);
                        }
                        break;
                    case "mixed":
                        sport = "Ski";
                        price = studentNumber * 10 * sleepNumber;
                        if (studentNumber >= 10 && studentNumber < 20) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.95);
                        } else if (studentNumber >= 20 && studentNumber < 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.85);
                        } else if (studentNumber >= 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.5);
                        } else {
                            System.out.printf("%s %.2f lv.", sport, price);
                        }
                        break;
                    default:
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "girls":
                        sport = "Athletics";
                        price = studentNumber * 7.2 * sleepNumber;
                        if (studentNumber >= 10 && studentNumber < 20) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.95);
                        } else if (studentNumber >= 20 && studentNumber < 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.85);
                        } else if (studentNumber >= 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.5);
                        } else {
                            System.out.printf("%s %.2f lv.", sport, price);
                        }
                        break;
                    case "boys":
                        sport = "Tennis";
                        price = studentNumber * 7.2 * sleepNumber;
                        if (studentNumber >= 10 && studentNumber < 20) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.95);
                        } else if (studentNumber >= 20 && studentNumber < 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.85);
                        } else if (studentNumber >= 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.5);
                        } else {
                            System.out.printf("%s %.2f lv.", sport, price);
                        }
                        break;
                    case "mixed":
                        sport = "Cycling";
                        price = studentNumber * 9.5 * sleepNumber;
                        if (studentNumber >= 10 && studentNumber < 20) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.95);
                        } else if (studentNumber >= 20 && studentNumber < 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.85);
                        } else if (studentNumber >= 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.5);
                        } else {
                            System.out.printf("%s %.2f lv.", sport, price);
                        }
                        break;
                    default:
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "girls":
                        sport = "Volleyball";
                        price = studentNumber * 15 * sleepNumber;
                        if (studentNumber >= 10 && studentNumber < 20) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.95);
                        } else if (studentNumber >= 20 && studentNumber < 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.85);
                        } else if (studentNumber >= 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.5);
                        } else {
                            System.out.printf("%s %.2f lv.", sport, price);
                        }
                        break;
                    case "boys":
                        sport = "Football";
                        price = studentNumber * 15 * sleepNumber;
                        if (studentNumber >= 10 && studentNumber < 20) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.95);
                        } else if (studentNumber >= 20 && studentNumber < 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.85);
                        } else if (studentNumber >= 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.5);
                        } else {
                            System.out.printf("%s %.2f lv.", sport, price);
                        }
                        break;
                    case "mixed":
                        sport = "Swimming";
                        price = studentNumber * 20 * sleepNumber;
                        if (studentNumber >= 10 && studentNumber < 20) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.95);
                        } else if (studentNumber >= 20 && studentNumber < 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.85);
                        } else if (studentNumber >= 50) {
                            System.out.printf("%s %.2f lv.", sport, price * 0.5);
                        } else {
                            System.out.printf("%s %.2f lv.", sport, price);
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }
}
/*
Частно училище организира лагери за учениците по време на ваканциите. В зависимост от вида на
ваканцията (пролетна, лятна или зимна) и вида на групата (момчета/момичета или смесена) цената на
нощувката в хотела е различна, както и спортът, който ще практикуват учениците.
Зимна ваканция Пролетна ваканция Лятна ваканция

момчета/момичета 9.60 7.20 15
смесена група 10 9.50 20
Училището получава отстъпка от крайната цена, в зависимост от броя на настанените в хотела ученици:
 Ако броят на учениците е 50 или повече, училището получава 50% отстъпка

© Фондация Софтуерен университет (softuni.org). Този документ използва лиценз CC-BY- NC-SA.
Следвай ни: Стр. 17 от 18
 Ако броят на учениците е 20 или повече и в същото време по-малък от 50, училището получава 15%
отстъпка
 Ако броят на учениците е 10 или повече и в същото време по-малък от 20, училището получава 5%
отстъпка
В таблицата по-долу са дадени спортовете, които ще се практикуват в зависимост от вида на ваканцията и
групата:

Зимна ваканция Пролетна ваканция Лятна ваканция
момичета Gymnastics Athletics Volleyball
момчета Judo Tennis Football
смесена група Ski Cycling Swimming
Да се напише програма, която пресмята цената, която ще заплати училището за нощувките и принтира
спорта, който ще се практикува от учениците.
Вход
От конзолата се четат 4 реда:
12. Сезонът – текст - “Winter”, “Spring” или “Summer”;
13. Видът на групата – текст - “boys”, “girls” или “mixed”;
14. Брой на учениците – цяло число в интервала [1 … 10000];
15. Брой на нощувките – цяло число в интервала [1 … 100].
Изход
На конзолата се отпечатва 1 ред:
 Спортът, който са практикували учениците и цената за нощувките, която е заплатило училището,
форматирана до втория знак след десетичната запетая, в следния формат:
&quot;{спортът} {цената} lv.“
 */