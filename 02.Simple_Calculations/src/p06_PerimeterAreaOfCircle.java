import java.util.Scanner;

public class p06_PerimeterAreaOfCircle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double radius = Double.parseDouble(console.nextLine());
        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * radius * radius;


        System.out.printf("Area = %f%n", area);
        System.out.printf("Perimeter = %f", perimeter);
        //Напишете програма, която чете от конзолата число r, въведено от потребителя, и пресмята и отпечатва лицето и периметъра на кръг / окръжност с радиус r.
    }
}
