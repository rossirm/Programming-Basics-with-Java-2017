import java.util.Scanner;

public class p11_Cinema {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        double result = 0;

        switch (projection) {
            case "Premiere":
                result = rows * columns * 12.00;
                System.out.printf("%.2f leva", result);
                break;
            case "Normal":
                result = rows * columns * 7.50;
                System.out.printf("%.2f leva", result);

                break;
            case "Discount":
                result = rows * columns * 5.00;
                System.out.printf("%.2f leva", result);
                break;
        }
    }
}
/*
        if (projection.equals("Premiere")) {
            result = rows*columns*12.00;
            System.out.printf("%.2f leva", result);
        } else if ( projection.equals("Normal")) {
            result = rows*columns*7.50;
            System.out.printf("%.2f leva", result);

        } else if ( projection.equals("Discount")) {
            result = rows*columns*5.00;
            System.out.printf("%.2f leva", result);
        }

една кинозала столовете са наредени в правоъгълна форма в r реда и c колони. Има три вида прожекции с
билети на различни цени:
 Premiere – премиерна прожекция, на цена 12.00 лева.
 Normal – стандартна прожекция, на цена 7.50 лева.
 Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
Напишете програма, която чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа),
въведени от потребителя, и изчислява общите приходи от билети при пълна зала. Резултатът да се отпечата
във формат като в примерите по-долу, с 2 знака след десетичната точка.
 */
