import java.util.Scanner;

public class p15_Vegetables {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double vegInLv = Double.parseDouble(console.nextLine());
        double fruitsInLev = Double.parseDouble(console.nextLine());
        int vegKg = Integer.parseInt(console.nextLine());
        int fruitKg = Integer.parseInt(console.nextLine());
        double result = (vegInLv * vegKg + fruitKg * fruitsInLev) / 1.94;
        System.out.printf("%.14f", result);
    }
}
/*
Градинар продавал реколтата от градината си на зеленчуковата борса. Продава зеленчуци за N лева на килограм и плодове за M лева за килограм. Напишете програма, която да пресмята приходите от реколтата в евро ( ако приемем, че едно евро е равно на 1.94лв).
 */
