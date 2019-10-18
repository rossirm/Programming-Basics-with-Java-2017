import java.util.Scanner;

public class p02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tomatoQuantity = Double.parseDouble(scan.nextLine());
        int countCadges = Integer.parseInt(scan.nextLine());
        int countCups = Integer.parseInt(scan.nextLine());

        double total = tomatoQuantity / 5.0;
        System.out.printf("Total lutenica: %.0f kilograms.%n", Math.floor(total));
        double cups = total / 0.535;
        double cadges = (cups / countCups);
        double left = 0.0;
        double result = 0.0;
        if (cadges > countCadges) {
            left = cadges - countCadges;
            result = cups - countCadges * countCups;
            System.out.printf("%.0f boxes left.%n", Math.floor(left));
            System.out.printf("%.0f jars left.", Math.floor(result));
        } else if (cadges < countCadges) {
            left = countCadges - cadges;
            result = (countCadges * countCups) - cups;
            System.out.printf("%.0f more boxes needed.%n", Math.floor(left));
            System.out.printf("%.0f more jars needed.", Math.floor(result));
        }
    }
}
