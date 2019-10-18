import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double weight = Double.parseDouble(scan.nextLine());
        String type = scan.nextLine().toLowerCase();
        int distance = Integer.parseInt(scan.nextLine());
        double pricePerKilometer = 0.0;
        double result = 0.0;
        double result1 = 0.0;
        double up = 0.0;
        double up2 = 0.0;
        double up3 = 0.0;

        if (type.equals("standard")) {
            if (weight < 1.0) {
                pricePerKilometer = 0.03;
                result = distance * pricePerKilometer;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            } else if (weight >= 1 && weight <= 10) {
                pricePerKilometer = 0.05;
                result = distance * pricePerKilometer;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            } else if (weight >= 11 && weight <= 40) {
                pricePerKilometer = 0.10;
                result = distance * pricePerKilometer;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            } else if (weight >= 41 && weight <= 90) {
                pricePerKilometer = 0.15;
                result = distance * pricePerKilometer;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            } else if (weight >= 91 && weight <= 150) {
                pricePerKilometer = 0.20;
                result = distance * pricePerKilometer;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            }
        } else if (type.equals("express")) {
            if (weight < 1.0) {
                pricePerKilometer = 0.03;
                result1 = distance * pricePerKilometer;
                up = 0.80 * pricePerKilometer;
                up2 = distance * up;
                up3 = weight * up2;
                result = result1 + up3;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            } else if (weight >= 1 && weight <= 10) {
                pricePerKilometer = 0.05;
                result1 = distance * pricePerKilometer;
                up = 0.40 * pricePerKilometer;
                up2 = distance * up;
                up3 = weight * up2;
                result = result1 + up3;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            } else if (weight >= 11 && weight <= 40) {
                pricePerKilometer = 0.10;
                result1 = distance * pricePerKilometer;
                up = 0.05 * pricePerKilometer;
                up2 = distance * up;
                up3 = weight * up2;
                result = result1 + up3;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            } else if (weight >= 41 && weight <= 90) {
                pricePerKilometer = 0.15;
                result1 = distance * pricePerKilometer;
                up = 0.02 * pricePerKilometer;
                up2 = distance * up;
                up3 = weight * up2;
                result = result1 + up3;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            } else if (weight >= 91 && weight <= 150) {
                pricePerKilometer = 0.20;
                result1 = distance * pricePerKilometer;
                up = 0.01 * pricePerKilometer;
                up2 = distance * up;
                up3 = weight * up2;
                result = result1 + up3;
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
            }
        }
    }
}
