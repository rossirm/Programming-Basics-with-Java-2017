import java.util.Scanner;

public class p10_Numbers_100_200 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number >= 100 && number <= 200){
            System.out.println("Between 100 and 200");
        } else if (number > 200) {
            System.out.println("Greater than 200");
        }
    }
}
/*
Да се напише програма, която чете цяло число, въведено от потребителя, и проверява дали е под 100, между
100 и 200 или над 200. Да се отпечатат съответно съобщения като в примерите по-долу:
 */
