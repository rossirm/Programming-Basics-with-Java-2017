import java.util.Scanner;

public class p07_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        //double base = Math.abs(x1 - x2);
        double base = Math.max(x1, x2) - Math.min(x1, x2);
        //double height = Math.abs(y2 - y1);
        double height = Math.max(y1, y2) - Math.min(y1, y2);
        double area = base * height;
        double perimeter = 2 * base + 2 * height;

        System.out.println(area);
        System.out.println(perimeter);
        //Правоъгълник е зададен с координатите на два от своите срещуположни ъгъла (x1, y1) – (x2, y2). Да се пресметнат площта и периметъра му. Входът се въвежда от потребителя. Числата x1, y1, x2 и y2 са дадени по едно наред. Изходът се извежда на конзолата и трябва да съдържа два реда с по една число на всеки от тях – лицето и периметъра.
    }
}
