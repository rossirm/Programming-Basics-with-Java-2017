import java.util.Scanner;

public class p06_Point_on_Rectangle_Border {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean onLeftSide = (x == x1) && (y >= y1) && (y <= y2);
        boolean onRightSide = (x == x2) && (y >= y1) && (y <= y2);
        boolean onUpSide = (y == y1) && (x >= x1) && (x <= x2);
        boolean onDownSide = (y == y2) && (x >= x1) && (x <= x2);

        if (onLeftSide || onRightSide || onUpSide || onDownSide) {
            System.out.println("Border");
        }
        /*
        if ((((x == x1) || (x == x2)) && (y >= y1) && (y <= y2)) ||
                (((y == y1) || (y == y2)) && (x >= x1) && (x <= x2))) {
            System.out.println("Border");
        }
        */
        else {
            System.out.println("Inside / Outside");
        }
    }
}
/*
Напишете програма, която проверява дали точка {x, y} се намира върху някоя от страните на правоъгълник
{x1, y1} – {x2, y2}. Входните данни се четат от конзолата и се състоят от 6 реда, въведени от потребителя:
десетичните числа x1, y1, x2, y2, x и y (като се гарантира, че x1 &lt; x2 и y1 &lt; y2). Да се отпечата „Border“
(точката лежи на някоя от страните) или „Inside / Outside“ (в противен случай).
Напишете програма, която проверява дали точка {x, y} се намира върху някоя от страните на правоъгълник
{x1, y1} – {x2, y2}. Входните данни се четат от конзолата и се състоят от 6 реда, въведени от потребителя:
десетичните числа x1, y1, x2, y2, x и y (като се гарантира, че x1 &lt; x2 и y1 &lt; y2). Да се отпечата „Border“
(точката лежи на някоя от страните) или „Inside / Outside“ (в противен случай).
 */