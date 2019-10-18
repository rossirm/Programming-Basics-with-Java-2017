//import java.util.Date;

import java.util.Scanner;

public class p14_Time_plus_15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());
        min = min + 15;

        if (min > 59) {
            hour += 1;
            min -= 60;
            if (hour > 23) {
                hour = 0;
                if (min >= 0 && min < 10) {
                    System.out.printf("%d:0%d", hour, min);
                } else {
                    System.out.printf("%d:%d", hour, min);
                }
            } else if (min >= 0 && min < 10) {
                System.out.printf("%d:0%d", hour, min);
            } else {
                System.out.printf("%d:%d", hour, min);
            }
        } else {
            System.out.printf("%d:%d", hour, min);
        }
        /*
        System.out.println();
        Date date = new Date();
        System.out.printf("%1$tH:%1$tM", date);
        */
    }
}
/*
Да се напише програма, която чете час и минути от 24-часово денонощие, въведени от потребителя, и
изчислява колко ще е часът след 15 минути. Резултатът да се отпечата във формат hh:mm. Часовете винаги са
между 0 и 23, а минутите винаги са между 0 и 59. Часовете се изписват с една или две цифри. Минутите се
изписват винаги с по две цифри, с водеща нула когато е необходимо.
Подсказка: добавете 15 минути и направете няколко проверки. Ако минутите надвишат 59, увеличете
часовете с 1 и намалете минутите със 60. По аналогичен начин разгледайте случая, когато часовете надвишат
23. При печатането на минутите проверете за водеща нула.
 */