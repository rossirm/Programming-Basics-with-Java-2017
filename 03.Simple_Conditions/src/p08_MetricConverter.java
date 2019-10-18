import java.util.Objects;
import java.util.Scanner;

public class p08_MetricConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double numbersToConvert = Double.parseDouble(scan.nextLine());
        String sourceMetric = scan.nextLine();
        String destMetric = scan.nextLine();

        double size = numbersToConvert;

        if (Objects.equals(sourceMetric, "m")) {
            size = size / 1;
        } else if (Objects.equals(sourceMetric, "mm")) {
            size = size / 1000;
        } else if (Objects.equals(sourceMetric, "cm")) {
            size = size / 100;
        } else if (Objects.equals(sourceMetric, "mi")) {
            size = size / 0.000621371192;
        } else if (Objects.equals(sourceMetric, "in")) {
            size = size / 39.3700787;
        } else if (Objects.equals(sourceMetric, "km")) {
            size = size / 0.001;
        } else if (Objects.equals(sourceMetric, "ft")) {
            size = size / 3.2808399;
        } else if (Objects.equals(sourceMetric, "yd")) {
            size = size / 1.0936133;
        }

        if (Objects.equals(destMetric, "m")) {
            size = size * 1;
        } else if (Objects.equals(destMetric, "mm")) {
            size = size * 1000;
        } else if (Objects.equals(destMetric, "cm")) {
            size = size * 100;
        } else if (Objects.equals(destMetric, "mi")) {
            size = size * 0.000621371192;
        } else if (Objects.equals(destMetric, "in")) {
            size = size * 39.3700787;
        } else if (Objects.equals(destMetric, "km")) {
            size = size * 0.001;
        } else if (Objects.equals(destMetric, "ft")) {
            size = size * 3.2808399;
        } else if (Objects.equals(destMetric, "yd")) {
            size = size * 1.0936133;
        }
        System.out.printf("%.8f %s", size, destMetric);
    }
}
/*
Да се напише програма, която преобразува разстояние между следните 8 мерни единици: m, mm, cm, mi, in,
km, ft, yd. Използвайте съответствията от таблицата по-долу:

входна единица изходна единица
1 meter (m) 1000 millimeters (mm)
1 meter (m) 100 centimeters (cm)
1 meter (m) 0.000621371192 miles (mi)
1 meter (m) 39.3700787 inches (in)
1 meter (m) 0.001 kilometers (km)
1 meter (m) 3.2808399 feet (ft)
1 meter (m) 1.0936133 yards (yd)
Входните данни се състоят от три реда, въведени от потребителя:
 Първи ред: число за преобразуване
 Втори ред: входна мерна единица
 Трети ред: изходна мерна единица (за резултата)

Резултатът да се форматира до осмия знак след десетичната запетая.
 */