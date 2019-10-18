import java.util.Scanner;

public class p16_Terakot {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double N = Double.parseDouble(console.nextLine());
        double W = Double.parseDouble(console.nextLine());
        double L = Double.parseDouble(console.nextLine());
        double M = Double.parseDouble(console.nextLine());
        double O = Double.parseDouble(console.nextLine());

        double totalArea = N * N;
        double benchArea = M * O;
        double areaForCovering = totalArea - benchArea;
        double areaPlates = W * L;
        double plates = (areaForCovering / areaPlates);
        double time = plates * 0.2;

        System.out.printf("%.2f", plates);
        System.out.println();
        System.out.printf("%.2f", time);
    }
}
/*
На площадката пред жилищен блок трябва да се поставят плочки. Площадката е с форма на квадрат със страна N метра. Плочките са широки „W“ метра и дълги „L“ метра. На площадката има една пейка с ширина M метра и дължина O метра. Под нея не е нужно да се слагат плочки. Всяка плочка се поставя за 0.2 минути.
Напишете програма, която чете от конзолата размерите на площадката, плочките и пейката и пресмята колко плочки са необходими да се покрие площадката и пресмята времето за поставяне на всички плочки.
Пример: площадка с размер 20м. има площ 400кв.м. Пейка широка 1м. и дълга 2м., заема площ 2кв.м. Една плочка е широка 5м. и дълга 4м. има площ = 20кв.м. Площта която трябва да се покрие е 400 – 2 = 398 кв.м. Необходими са 398 / 20 = 19.90 плочки. Необходимото време е 19.90 * 0.2 = 3.98 минути.
 */