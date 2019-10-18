import java.util.Scanner;

public class p17_Money {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int bitcoins = Integer.parseInt(console.nextLine());
        double china = Double.parseDouble(console.nextLine());
        double earn = Double.parseDouble(console.nextLine());

        double bgn1 = bitcoins * 1168;
        double usd = china * 0.15;
        double bgn2 = usd * 1.76;
        double bgn3 = bgn1 + bgn2;
        double euro = bgn3 / 1.95;
        double earning = (earn * euro) / 100;
        double result = euro - earning;

        System.out.printf("%.2f", result);
    }
}
/*
Преди време Пешо си е купил биткойни. Сега ще ходи на екскурзия из Европа и ще му трябват евра. Освен
биткойни има и китайски юанa. Пешо иска да обмени парите си в евро за екскурзията. Напишете програма,
която да пресмята колко евра може да купи спрямо следните валутни курсове:
 1 биткойн = 1168 лева.
 1 китайски юан = 0.15 долара.
 1 долар = 1.76 лева.
 1 евро = 1.95 лева.
Обменnото бюро има комисионна от 0 до 5 процента от крайната сума в евро.
 */
