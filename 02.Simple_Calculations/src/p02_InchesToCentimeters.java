import java.util.Scanner;

public class p02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("inches: ");
        double inches = Double.parseDouble(console.nextLine());
        double centimeters = inches * 2.54;
        System.out.println("centimeters = " + centimeters);
    }
}
//Да се напише програма, която чете от конзолата число (не непременно цяло), въведено от потребителя, и преобразува числото от инчове в сантиметри. За целта умножава инчовете по 2.54 (защото 1 инч = 2.54 сантиметра).