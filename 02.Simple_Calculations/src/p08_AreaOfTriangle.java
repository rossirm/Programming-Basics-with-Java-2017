import java.util.Scanner;

public class p08_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double side = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());

        double area = side * height / 2;

        System.out.printf("Triangle area = %.2f", area);
        //Напишете програма, която чете от конзолата страна и височина на триъгълник, въведено от потребителя, и пресмята неговото лице. Използвайте формулата за лице на триъгълник: area = a * h / 2. Закръглете резултата до 2 знака след десетичната точка използвайки “%.2f“.
    }
}
