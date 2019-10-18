import java.util.Scanner;

public class p18_DailyEarn {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int N = Integer.parseInt(console.nextLine());
        double M = Double.parseDouble(console.nextLine());
        double currency = Double.parseDouble(console.nextLine());

        double salarydollars = N * M;
        double bonus = salarydollars * 2.5;
        double yearearndollars = (salarydollars * 12) + bonus;
        double tax = 0.25 * yearearndollars;
        double clearearndollars = yearearndollars - tax;
        double bgn = clearearndollars * currency;
        double averagedayearn =  bgn / 365;

        System.out.printf("%.2f", averagedayearn);
    }
}
/*
Иван е програмист в американска компания и работи от вкъщи средно N дни в месеца като изкарва средно по M долара на ден. В края на годината Иван получава бонус, който е равен на 2.5 месечни заплати. От спечеленото през годината му се удържат 25% данъци. Напишете програма, която да пресмята, колко е чистата средна печалба на Иван на ден в лева, тъй като той харчи изкараното в България. Приема се, че в годината има точно 365 дни. Курсът на долара спрямо лева ще се чете от конзолата.
 */