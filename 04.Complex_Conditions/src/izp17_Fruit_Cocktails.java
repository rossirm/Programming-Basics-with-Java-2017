import java.util.Scanner;

public class izp17_Fruit_Cocktails {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fruitType = scan.nextLine();
        String sizeOfCocktail = scan.nextLine().toLowerCase();
        int number = Integer.parseInt(scan.nextLine());

        double price = 0.0;

        switch (sizeOfCocktail) {
            case "small":
                switch (fruitType) {
                    case "Watermelon":
                        price = 2 * 56 * number;
                        if (price >= 400 && price <= 1000) {
                            System.out.printf("%.2f lv.", price * 0.85);
                        } else if (price > 1000) {
                            System.out.printf("%.2f lv.", price * 0.5);
                        } else if (!((price >= 400 && price <= 1000) || (price > 1000)))
                            System.out.printf("%.2f lv.", price);
                        break;
                    case "Mango":
                        price = 2 * 36.66 * number;
                        if (price >= 400 && price <= 1000) {
                            System.out.printf("%.2f lv.", price * 0.85);
                        } else if (price > 1000) {
                            System.out.printf("%.2f lv.", price * 0.5);
                        } else if (!((price >= 400 && price <= 1000) || (price > 1000)))
                            System.out.printf("%.2f lv.", price);
                        break;
                    case "Pineapple":
                        price = 2 * 42.10 * number;
                        if (price >= 400 && price <= 1000) {
                            System.out.printf("%.2f lv.", price * 0.85);
                        } else if (price > 1000) {
                            System.out.printf("%.2f lv.", price * 0.5);
                        } else if (!((price >= 400 && price <= 1000) || (price > 1000)))
                            System.out.printf("%.2f lv.", price);
                        break;
                    case "Raspberry":
                        price = 2 * 20 * number;
                        if (price >= 400 && price <= 1000) {
                            System.out.printf("%.2f lv.", price * 0.85);
                        } else if (price > 1000) {
                            System.out.printf("%.2f lv.", price * 0.5);
                        } else if (!((price >= 400 && price <= 1000) || (price > 1000)))
                            System.out.printf("%.2f lv.", price);
                        break;
                }
                break;
            case "big":
                switch (fruitType) {
                    case "Watermelon":
                        price = 5 * 28.70 * number;
                        if (price >= 400 && price <= 1000) {
                            System.out.printf("%.2f lv.", price * 0.85);
                        } else if (price > 1000) {
                            System.out.printf("%.2f lv.", price * 0.5);
                        } else if (!((price >= 400 && price <= 1000) || (price > 1000)))
                            System.out.printf("%.2f lv.", price);
                        break;
                    case "Mango":
                        price = 5 * 19.60 * number;
                        if (price >= 400 && price <= 1000) {
                            System.out.printf("%.2f lv.", price * 0.85);
                        } else if (price > 1000) {
                            System.out.printf("%.2f lv.", price * 0.5);
                        } else if (!((price >= 400 && price <= 1000) || (price > 1000)))
                            System.out.printf("%.2f lv.", price);
                        break;
                    case "Pineapple":
                        price = 5 * 24.80 * number;
                        if (price >= 400 && price <= 1000) {
                            System.out.printf("%.2f lv.", price * 0.85);
                        } else if (price > 1000) {
                            System.out.printf("%.2f lv.", price * 0.5);
                        } else if (!((price >= 400 && price <= 1000) || (price > 1000)))
                            System.out.printf("%.2f lv.", price);
                        break;
                    case "Raspberry":
                        price = 5 * 15.20 * number;
                        if (price >= 400 && price <= 1000) {
                            System.out.printf("%.2f lv.", price * 0.85);
                        } else if (price > 1000) {
                            System.out.printf("%.2f lv.", price * 0.5);
                        } else if (!((price >= 400 && price <= 1000) || (price > 1000)))
                            System.out.printf("%.2f lv.", price);
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
Новият хит на плажа са плодови коктейли в кофи. Предлагат се кофи от 2 л. и 5 л. като цената на коктейлите
зависи от плодовете, които се съдържат в тях. В зависимост от размера на питието, което се поръчва цената
за литър е различна. От конзолата се четат плодовете, размерът на коктейла ((малък) 2 л. или (голям) 5 л.),
както и колко питиета си поръчва клиентът. Да се напише програма, която изчислява сумата, която трябва да
се плати за поръчката.

Диня Манго Ананас Малина
2 литра (small) 56 лв./л. 36.66 лв./л. 42.10 лв./л. 20 лв./л.
5 литра (big) 28.70 лв./л. 19.60 лв./л. 24.80 лв./л. 15.20 лв./л.
При поръчки:
 над 1000 лв. има 50% отстъпка;
 от 400 лв. до 1000 лв. има 15% отстъпка;
Вход
От конзолата се четат 3 реда:

© Фондация Софтуерен университет (softuni.org). Този документ използва лиценз CC-BY- NC-SA.
Следвай ни: Стр. 17 от 18

5. Плод – текст - “Watermelon”, “Mango”, “Pineapple” или “Raspberry”;
6. Размерът на коктейла – текст - “small” или “big”;
7. Брой на поръчаните питиета – цяло число в интервала [1 … 10000];
Изход
На конзолата се отпечатва 1 ред:
 Цената, която заплаща клиентът, форматирана до втория знак след десетичната запетая, в следния
формат:
&quot;{цената} lv.“
 */