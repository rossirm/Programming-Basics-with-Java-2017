import java.util.Scanner;

public class p10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double rad = Double.parseDouble(console.nextLine());
        double deg = rad * 180 / Math.PI;
        double number = Math.round(deg);

        System.out.printf("%.2f", number);
        //Напишете програма, която чете ъгъл в радиани (rad), въведен от потребителя, и го преобразува в градуси (deg). Потърсете в Интернет подходяща формула. Числото π в Java програми е достъпно чрез Math.PI. Закръглете резултата до най-близкото цяло число.
    }
}
