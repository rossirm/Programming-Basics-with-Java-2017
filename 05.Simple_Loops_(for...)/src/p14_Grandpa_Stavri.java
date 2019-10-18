import java.util.Scanner;

public class p14_Grandpa_Stavri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double quantity = 0.0;
        double deg = 0.0;
        double sumQuantity = 0.0;
        double degrees = 0.0;
        double sumDegrees = 0.0;
        double totalDegrees = 0.0;

        for (int i = 1; i <= n; i++) {
            quantity = Double.parseDouble(scan.nextLine());
            deg = Double.parseDouble(scan.nextLine());
            degrees = quantity * deg;
            sumQuantity += quantity;
            sumDegrees += degrees;
        }
        totalDegrees = sumDegrees / sumQuantity;

        System.out.printf("Liter: %.2f", sumQuantity);
        System.out.println();
        System.out.printf("Degrees: %.2f", totalDegrees);
        System.out.println();
        if (totalDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (totalDegrees >= 38 && totalDegrees <= 42) {
            System.out.println("Super!");
        } else if (totalDegrees > 42) {
            System.out.println("Dilution with distilled water!");
        }
    }
}
/*
Дядо Ставри има казан за ракия и всеки ден вари от любимата си напитка. Ако вари N дена и всеки ден получава различно количество ракия и алкохолен градус, да се намери за всичките дни общото количество ракия и градуса на получената смес.
Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
•	На първия ред – N – брой дни  – цяло число в интервала [1...300]
•	За всеки един ден на отделен ред :
	количество на ракията – реално число в интервала [1.00...500.00]
	градус на получената напитка - реално число в интервала [10.00...99.00]
Изход
Да се отпечатат на конзолата 3 реда, както следва:
•	Първи ред – да се отпечатва съобщение форматирано до втори знак „Liter:{общо литрите}“
•	Втори ред – да се отпечатва съобщение форматирано до втори знак „Degrees:{градусите на общата смес}  ;
•	Трети ред – да се отпечатва:
	Ако градусът е по-малко от 38, да се отпечата съобщение „Не е добре, трябва преваряване!“. "Not good, you should baking!".
	Ако е от 38 до 42, да се отпечата съобщение „Супер!“ "Super!"
	Ако е повече от 42, да се отпечата „Разреждане с дестилирана вода!“ "Dilution with distilled water!"
 */
