import java.util.Scanner;

public class p11_Enter_Even_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter even number: ");
        int n = 0;

        while (true) {
            try {
                n = Integer.parseInt(scan.nextLine());
                if (n % 2 ==0) {
                    break;
                } else {
                    System.out.println("Number is not even!");
                    System.out.println("Enter even number: ");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number!");

                System.out.println("Even number entered: " + n);
            }
        }
        System.out.println("Even number entered " + n);
    }
}
/*
Напишете програма, която чете четно число, въведено от потребителя. Ако потребителят въведе грешно число (нечетно число или стринг, който не е цяло число), трябва да му излиза съобщение за грешка и да въвежда отново.
Подсказки:
•	В цикъл въвеждайте число и проверявайте дали е четно. При коректно число излезте от цикъла.
•	С try { … } catch { … } конструкция прихванете грешните числа, които не могат да се обърнат в int.
 */
