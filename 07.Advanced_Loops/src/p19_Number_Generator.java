import java.util.Scanner;

public class p19_Number_Generator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());
        int special = Integer.parseInt(scanner.nextLine());
        int control = Integer.parseInt(scanner.nextLine());

        for (int i = first; i >= 1; i--) {
            for (int j = second; j >= 1; j--) {
                for (int k = three; k >= 1; k--) {
                    int number = i * 100 + j * 10 + k;
                    if (number % 3 == 0) {
                        special += 5;
                    } else if (number % 5 == 0) {
                        special -= 2;
                    } else if (number % 2 == 0) {
                        special *= 2;
                    }
                    if (special >= control) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.%n", special);
                        return;
                    }
                }
            }
        }
        if (special < control) {
            System.out.printf("No! %d is the last reached special number.", special);
        }
    }
}
/*
Да се напише програма, която прочита от конзолата три цели числа – M, N и L, и генерира всички числа в диапазона от MNL до 111. От конзолата се чете едно специално и едно контролно число. За всяка комбинация от тройката числа се прави проверка:
1.	Ако се дели на 3 без остатък – към специалното число се добавя 5;
2.	Ако завършва на 5 – от специалното число се вади 2;
3.	Ако е четно число – специалното число се умножава по 2.
Трябва да се има предвид, едно число може да отговаря на повече от една проверка. В такъв случай трябва да се гледа приоритетът на операциите. Първо дали се дели на 3, после дали завършва на 5 и накрая дали е четно числото. Например:
972 се дели на 3 и е четно. В такъв случай изпълняваме само операцията с най-голям приоритет и към специалното число добавяме 5, но НЕ го умножаваме по 2 след това.
315 се дели на 3 и завършва на 5. Към специалното число добавяме 5.
В случай, че не отговаря на нито една от посочените проверки, НЕ се извършва операция и програмата продължава. Ако специалното число стане равно или по-голямо от контролното програмата приключва.
Вход
От конзолата се четат 5 числа, всяко на отделен ред:
1.	М – цяло число в интервала [1 … 9];
2.	N – цяло число в интервала [1 … 9];
3.	L – цяло число в интервала [1 … 9];
4.	Специално число – цяло число в интервала [0 … 100];
5.	Контролно число – цяло число в интервала [0 … 1000];
Изход
Отпечатването на конзолата зависи от резултата:
•	Ако контролното число е достигнато се отпечатват 1 ред:
o	“Yes! Control number was reached! Current special number is {специалното число}.”
•	Ако контролното число НЕ е достигнато се отпечатва 1 ред:
o	“No! {специалното число} is the last reached special number.”
 */