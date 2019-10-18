import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        double weight = Double.parseDouble(scan.nextLine());

        double lengthOfNet = 2 * length + 2 * width;
        double priceOfNet = lengthOfNet * price;
        double area = lengthOfNet * height;
        double weightOfNet = area * weight;

        System.out.printf("%.0f%n", lengthOfNet);
        System.out.printf("%.2f%n", priceOfNet);
        System.out.printf("%.3f", weightOfNet);
    }
}
