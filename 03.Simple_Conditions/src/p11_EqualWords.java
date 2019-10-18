import java.util.Scanner;

public class p11_EqualWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word1 = scan.nextLine().toLowerCase();
        String word2 = scan.nextLine().toLowerCase();

        if (word1.equals(word2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
/*
Да се напише програма, която чете две думи, въведени от потребителя, и проверява дали са еднакви. Да не
се прави разлика между главни и малки думи. Да се изведе “yes” или “no”.
Подсказка: използвайте if-else конструкция. Преди сравняване на думите ги обърнете в долен регистър:
word = word.toLowerCase().
 */