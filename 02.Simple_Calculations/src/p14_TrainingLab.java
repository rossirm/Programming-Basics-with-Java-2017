import java.util.Scanner;

public class p14_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        int hDesk = 120;
        int wDesk = 70;
        int missDesk = 3;
        int hall = 100;

        double rowsDesk = Math.floor((h * 100) / hDesk);
        double seatsDesk = Math.floor(((w * 100) - hall) / wDesk);

        double allDesk = (int) ((rowsDesk * seatsDesk) - missDesk);

        System.out.println(allDesk);
    }
}
/*
Учебна зала има правоъгълен размер w на h
метра, без колони във вътрешността си. Залата е
разделена на две части – лява и дясна, с коридор
приблизително по средата. В лявата и в дясната
част има редици с бюра. В задната част на залата
има голяма входна врата. В предната част на
залата има катедра с подиум за преподавателя.
Едно работно място заема 70 на 120 cm (маса с размер 70 на 40 cm + място за стол и преминаване с размер
70 на 80 cm). Коридорът е широк поне 100 cm. Изчислено е, че заради входната врата (която е с отвор 160
cm) се губи точно 1 работно място, а заради катедрата (която е с размер 160 на 120 cm) се губят точно 2
работни места. Напишете програма, която прочита размерите на учебната зала и изчислява броя работни
места в нея при описаното разположение (вж. фигурата).
 */