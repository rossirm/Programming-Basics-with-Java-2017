import java.util.Scanner;

public class p18_Football_League {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double capacity = Double.parseDouble(scan.nextLine());
        double fenNumbers = Double.parseDouble(scan.nextLine());

        double sumA = 0.0;
        double sumB = 0.0;
        double sumV = 0.0;
        double sumG = 0.0;

        for (int i = 0; i < fenNumbers; i++) {
            String inputSector = scan.nextLine().toUpperCase();
            if (inputSector.equals("A")) {
                sumA++;
            } else if (inputSector.equals("B")) {
                sumB++;
            } else if (inputSector.equals("V")) {
                sumV++;
            } else if (inputSector.equals("G")) {
                sumG++;
            }
        }

        double percentA = (sumA / fenNumbers) * 100.0;
        double percentB = (sumB / fenNumbers) * 100.0;
        double percentV = (sumV / fenNumbers) * 100.0;
        double percentG = (sumG / fenNumbers) * 100.0;
        double percentCapacity = (fenNumbers / capacity) * 100.0;
        System.out.printf("%.2f%%\n", percentA);
        System.out.printf("%.2f%%\n", percentB);
        System.out.printf("%.2f%%\n", percentV);
        System.out.printf("%.2f%%\n", percentG);
        System.out.printf("%.2f%%\n", percentCapacity);
    }
}
/*
Екипът на СофтУни си организира футболен турнир. Първоначално прочитаме от конзолата капацитета на
стадиона и броят на всички фенове. След това за всеки фен се чете секторът, в който се намира. Феновете
на първия отбор са в сектор А и Б, а на втория – В и Г. Да се напише програма, която изчислява процентите
на феновете във всеки сектор, спрямо общия брой фенове на стадиона, както и общият процент на
феновете за двата отбора, спрямо капацитета на стадиона. Общият брой на феновете НЕ надвишава
капацитета на стадиона.

Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
3. Капацитетът на стадиона – цяло число в интервала [1 … 10000];
4. Броят на всички фенове – цяло число в интервала [1 … 10000].
За всеки един фен, на отделен ред се прочита:
1. Секторът, на който се намира – текст - “A”, “B”, “V” и “G”.
Изход
Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00%, форматирани
до втората цифра след десетичната запетая:
1. Процентът на феновете в сектор А;
2. Процентът на феновете в сектор Б;
3. Процентът на феновете в сектор В;
4. Процентът на феновете в сектор Г;
5. Процентът на всички фенове, спрямо капацитета на стадиона.
 */