import java.util.Scanner;

public class p13_AreaOfFigures {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String figureName = scan.nextLine();
        double area = 0.0;
        if (figureName.equals("square")) {
            double a = Double.parseDouble(scan.nextLine());
            area = a * a;
        } else if (figureName.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a * b;
        }
        else if (figureName.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            area = Math.PI * Math.pow(r, 2); // r * r
        } else if (figureName.equals("triangle")) {
            double base = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());
            area = 0.5 * base * height;
        }
        System.out.printf("%.3f", area); //за закръглане Math.round();
    }
}
/*
Да се напише програма, в която потребителят въвежда вида и размерите на геометрична фигура и пресмята
лицето й. Фигурите са четири вида: квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник
(triangle). На първия ред на входа се чете вида на фигурата (square, rectangle, circle или triangle). Ако
фигурата е квадрат, на следващия ред се чете едно число – дължина на страната му. Ако фигурата е
правоъгълник, на следващите два реда четат две числа – дължините на страните му. Ако фигурата е кръг, на
следващия ред чете едно число – радиусът на кръга. Ако фигурата е триъгълник, на следващите два реда
четат две числа – дължината на страната му и дължината на височината към нея. Резултатът да се закръгли до
3 цифри след десетичната точка. Примери:
 */