import java.util.Scanner;

public class p03_Point_In_Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
/*
Напишете програма, която проверява дали точка {x, y} се намира вътре в правоъгълник {x1, y1} – {x2, y2}.
Входните данни се четат от конзолата и се състоят от 6 реда, въведени от потребителя: десетичните числа x1,
y1, x2, y2, x и y (като се гарантира, че x1 &lt; x2 и y1 &lt; y2). Една точка е вътрешна за даден правоъгълник, ако се
намира някъде във вътрешността му или върху някоя от страните му. Отпечатайте „Inside“ или „Outside“.
 */
