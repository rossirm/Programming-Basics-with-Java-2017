import java.util.Scanner;

public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        int sum = first + second + third;

        int minutes = 0;
        int seconds = 0;

        if (sum <= 59) {
            seconds += sum;
        } else if (sum > 59) {
            minutes = sum / 60;
            seconds = sum % 60;
        }
        if (seconds < 10) {
            System.out.printf("%s:0%s", minutes, seconds);
        } else {
            System.out.printf("%s:%s", minutes, seconds);
        }
    }
}

/*
Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50). Да се напише програма, която чете времената на състезателите, въведени от потребителя, и пресмята сумарното им време във формат "минути:секунди". Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").
•	Сумирайте трите числа и получете резултата в секунди. Понеже 1 минута = 60 секунди, ще трябва да изчислите броя минути и броя секунди в диапазона от 0 до 59.
•	Ако резултатът е между 0 и 59, отпечатайте 0 минути + изчислените секунди.
•	Ако резултатът е между 60 и 119, отпечатайте 1 минута + изчислените секунди минус 60.
•	Ако резултатът е между 120 и 179, отпечатайте 2 минути + изчислените секунди минус 120.
•	Ако секундите са по-малко от 10, изведете водеща нула преди тях.
 */