import java.util.Scanner;

public class p04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double n = Integer.parseInt(scan.nextLine());

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;

        for (int i = 1; i <= n; i++) {
            double mark = Double.parseDouble(scan.nextLine());
            if (mark >= 0 && mark < 22.5) {
                counter1++;
            } else if (mark >= 22.5 && mark < 40.5) {
                counter2++;
            } else if (mark >= 40.5 && mark < 58.5) {
                counter3++;
            } else if (mark >= 58.5 && mark < 76.5) {
                counter4++;
            } else if (mark >= 76.5 && mark <= 100) {
                counter5++;
            }
        }
        double result1 = counter1 / n * 100.0;
        double result2 = counter2 / n * 100.0;
        double result3 = counter3 / n * 100.0;
        double result4 = counter4 / n * 100.0;
        double result5 = counter5 / n * 100.0;

        System.out.printf("%.2f%% poor marks%n", result1);
        System.out.printf("%.2f%% satisfactory marks%n", result2);
        System.out.printf("%.2f%% good marks%n", result3);
        System.out.printf("%.2f%% very good marks%n", result4);
        System.out.printf("%.2f%% excellent marks%n", result5);
    }
}
