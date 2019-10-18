import java.util.Scanner;

public class izp16_Photo_Pictures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int countPhotos = Integer.parseInt(console.nextLine());
        String type = console.nextLine();
        String typeOfOrder = console.nextLine();

        double onePiecePrize = 0;
        double countDiscount = 1;


        switch (type) {
            case "9X13":
                onePiecePrize = 0.16;
                if (countPhotos >= 50) {
                    countDiscount = 0.95;
                }
                break;
            case "10X15":
                onePiecePrize = 0.16;
                if (countPhotos >= 80) {
                    countDiscount = 0.97;
                }
                break;
            case "13X18":
                onePiecePrize = 0.38;
                if (countPhotos >= 50 && countPhotos <= 100) {
                    countDiscount = 0.97;
                } else if (countPhotos > 100) {
                    countDiscount = 0.95;
                }
                break;
            case "20X30":
                onePiecePrize = 2.90;
                if (countPhotos >= 10 && countPhotos <= 50) {
                    countDiscount = 0.93;
                } else if (countPhotos > 50) {
                    countDiscount = 0.91;
                }
                break;
        }
        double sum = countPhotos * onePiecePrize * countDiscount;

        if (typeOfOrder.equals("online")) {
            sum *= 0.98;
        }
        System.out.printf("%.2fBGN", sum);
    }
}
/*
Фото-ателие приема поръчки за изваждане на снимки на хартия в няколко размера със следните цени за
една снимка. Една поръчка включва снимки само от един размер. В зависимост от поръчания брой снимки,
се прави различна отстъпка.

Размер Единична цена Отстъпка от цената
9X13 0.16 лв. Над 50 броя включително – 5%
10X15 0.16 лв. Над 80 броя включително – 3%
13X18 0.38 лв. От 50 до 100 броя включително – 3%
Над 100 броя – 5%
20X30 2.90 лв. От 10 до 50 броя включително – 7%
Над 50 броя – 9%

Ако поръчката се направи онлайн, се ползва допълнителна отстъпка 2%, независимо от броя на снимките.
Вход
Потребителят въвежда 3 реда:

© Фондация Софтуерен университет (softuni.org). Този документ използва лиценз CC-BY- NC-SA.
Следвай ни: Стр. 17 от 18

1. Брой снимки – цяло число в интервала [0..1000];
2. Вид снимки – текст &quot;9X13&quot; или &quot;10X15&quot; или &quot;13X18&quot; или &quot;20X30&quot;;
3. Начин на поръчване – текст &quot;online&quot; или &quot;office&quot;;
Изход
Извежда се едно число – стойността на поръчката, в следния формат:
o &quot;{стойност на поръчката}BGN&quot;
Резултатът да се форматира до два знака след десетичната запетая.
 */