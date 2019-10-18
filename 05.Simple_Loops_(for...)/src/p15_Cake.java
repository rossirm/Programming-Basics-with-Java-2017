import java.util.Scanner;

public class p15_Cake {
    private static final String STOP = "STOP";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int widthOfCake = Integer.parseInt(scan.nextLine());
        int lengthOfCake = Integer.parseInt(scan.nextLine());
        int area = widthOfCake * lengthOfCake;
        int pieces = 0;
        String input = null;

        for (int i = 0; i < area; i++) {
            input = scan.nextLine();

            if (STOP.equals(input)) {
                System.out.printf("%d pieces are left.", area);
                break;
            } else {
                pieces = Integer.parseInt(input);
                area = area - pieces;
                if (area < 0) {
                    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(area));
                    break;
                }
            }
        }
    }
}
/*
Поканен сте на 30-тия рожден ден на Кендрик Ламар, но като част от организацията. Той иска да покани
много гости и планира да вземе огромна торта. Иска да знае обаче колко парчета могат да се вземат от нея.
Всеки път когато някой си вземе, трябва да се отчита, че едно или повече парчета са взети. Така трябва да се
продължи докато не свърши тортата или докато гостите не спрат да си взимат.
Напишете програма, която да изчислява броя останали парчета. Ще получите размерите на тортата и след
това на всеки ред, докато не получите командата STOP или докато не свърши тортата (pieces &lt; 0), ще
получавате цяло число, равно на взетите парчета. Накрая трябва да се отпечата колко парчета са останали
или, че са свършили.
Note: Тортата е с правоъгълна форма. Едно парче е с размер 1х1.
Вход
Потребителят въвежда следните данни на отделни редове:
1. Широчина на тортата – цяло число в интервала [1...1000];
2. Дължина на тортата – цяло число в интервала [1...1000];
3. На следващите редове (докато не получите командата STOP) – брой парчета, които се взимат от
тортата – цели числа в интервала [1...1000];
Изход
Да се отпечата на конзолата един от следните редове:
o &quot;{брой парчета} pieces are left.&quot; - ако стигнете до STOP и не се свършили парчетата торта
o &quot;No more cake left! You need {брой недостигащи парчета} pieces more.&quot;
 */
