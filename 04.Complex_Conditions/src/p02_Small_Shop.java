import java.util.Scanner;

public class p02_Small_Shop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine().toLowerCase();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(0.5 * quantity);
            } else if (product.equals("water")) {
                System.out.println(0.8 * quantity);
            } else if (product.equals("beer")) {
                System.out.println(1.2 * quantity);
            } else if (product.equals("sweets")) {
                System.out.println(1.45 * quantity);
            } else if (product.equals("peanuts")) {
                System.out.println(1.6 * quantity);
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(0.4 * quantity);
            } else if (product.equals("water")) {
                System.out.println(0.7 * quantity);
            } else if (product.equals("beer")) {
                System.out.println(1.15 * quantity);
            } else if (product.equals("sweets")) {
                System.out.println(1.3 * quantity);
            } else if (product.equals("peanuts")) {
                System.out.println(1.5 * quantity);
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(0.45 * quantity);
            } else if (product.equals("water")) {
                System.out.println(0.7 * quantity);
            } else if (product.equals("beer")) {
                System.out.println(1.1 * quantity);
            } else if (product.equals("sweets")) {
                System.out.println(1.35 * quantity);
            } else if (product.equals("peanuts")) {
                System.out.println(1.55 * quantity);
            }
        }
    }
}
/*
3. Квартално магазинче
Следващата задача има за цел да тренира работата с вложени проверки (nested if). Ето го и условието:
предприемчив българин отваря квартални магазинчета в няколко града и продава на различни цени:
град / продукт coffee water beer sweets peanuts
Sofia 0.50 0.80 1.20 1.45 1.60
Plovdiv 0.40 0.70 1.15 1.30 1.50
Varna 0.45 0.70 1.10 1.35 1.55
Напишете програма, която чете град (стринг), продукт (стринг) и количество (десетично число), въведени от
потребителя, и пресмята и отпечатва колко струва съответното количество от избрания продукт в посочения
град.
 */