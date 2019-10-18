import java.util.Scanner;

public class p09_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double celsius = Double.parseDouble(console.nextLine());
        double fahreheit = celsius * 1.8 + 32;

        System.out.printf("%.2f", fahreheit);
        //Напишете програма, която чете градуси по скалата на Целзий (°C), въведени от потребителя, и ги преобразува до градуси по скалата на Фаренхайт (°F). Потърсете в Интернет подходяща формула, с която да извършите изчисленията. Закръглете резултата до 2 знака след десетичната точка.
    }
}
