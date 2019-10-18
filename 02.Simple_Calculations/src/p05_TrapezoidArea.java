import java.util.Scanner;

public class p05_TrapezoidArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

             double a = Double.parseDouble(console.nextLine());
             double b = Double.parseDouble(console.nextLine());
             double h = Double.parseDouble(console.nextLine());

             double area = (a + b) * h / 2;

             System.out.println(area);

             //HITRINKI :) :) :)
        //double number = Math.round(23.49);
        //System.out.println(number);
        //double number = Math.floor(23.95);
        //System.out.println(number);
        //double number = Math.ceil(23.25);
        //System.out.println(number);
        //System.out.printf("%03d", 3);
        //System.out.printf("%.2f", 4.56789);
                //Напишете програма, която чете от конзолата три числа b1, b2 и h, въведени от потребителя, и пресмята лицето на трапец с основи b1 и b2 и височина h. Формулата за лице на трапец е (b1 + b2) * h / 2.
    }
}

