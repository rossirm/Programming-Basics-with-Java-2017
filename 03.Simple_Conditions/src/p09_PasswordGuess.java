import java.util.Scanner;

public class p09_PasswordGuess {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        if (word.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
/*
Да се напише програма, която чете парола (един ред с произволен текст), въведена от потребителя, и
проверява дали въведеното съвпада с фразата “s3cr3t!P@ssw0rd”. При съвпадение да се изведе
“Welcome”. При несъвпадение да се изведе “Wrong password!”.
 */