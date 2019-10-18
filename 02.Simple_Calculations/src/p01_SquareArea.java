import java.util.Scanner;

public class p01_SquareArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("a = ");
        int a = Integer.parseInt(console.nextLine());
        int area = a * a;
        System.out.println("Square = " + area);
    }
}
//Първата задача от тази тема е следната: да се напише конзолна програма, която прочита цяло число a, въведено от потребителя, и пресмята лицето на квадрат със страна a. Задачата е тривиално лесна: въвеждате число от конзолата, умножавате го само по себе си и печатате получения резултат на конзолата.