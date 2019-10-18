import java.util.Scanner;

public class p17_Group_Name {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine().toUpperCase();
        String second = scan.nextLine().toLowerCase();
        String third = scan.nextLine().toLowerCase();
        String fourth = scan.nextLine().toLowerCase();
        int number = Integer.parseInt(scan.nextLine());

        int counter = 0;

        String text = first + second + third + fourth + number;
        char firstL = text.charAt(0);
        char secondL = text.charAt(1);
        char thirdL = text.charAt(2);
        char fourthL = text.charAt(3);
        char numberL = text.charAt(4);

        for (char i = 'A'; i <= firstL; i++) {
            for (char j = 'a'; j <= secondL; j++) {
                for (char k = 'a'; k <= thirdL; k++) {
                    for (char l = 'a'; l <= fourthL; l++) {
                        for (char m = '0'; m <= numberL; m++) {
                            if (i == firstL && j == secondL &&
                                    k == thirdL && l == fourthL &&
                                    m == numberL) {
                                break;
                            }
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
/*
Групата сменя своя ръководител и съответно трябва да се избере ново име. За целта всеки един танцьор дава предложения. Предложенията винаги се дават по азбучен ред от първата буква в азбуката до въведена. Името на групата съдържа и цифра. Винаги цифрата започва от нула и достига до въведената. Имената се дават по азбучен ред.
Да се изчисли колко предложения са били дадени преди да се достигне до името на групата, като се има предвид, че дължината на името винаги е 5 символа и винаги първия символ е главна буква, последващите 3 символа са малки букви ,а  последния е цифра.
Вход
От конзолата се четат 5 реда:
•	Голяма буква – символ в интервала [A - Z]
•	Малка буква – символ в интервала [a - z]
•	Малка буква – символ в интервала [a - z]
•	Малка буква – символ в интервала [a - z]
•	Цифра – цяло число в интервала [0 - 9]
Изход
Да се отпечата на конзолата цяло число – броя предложения точно преди достигането на името.
 */