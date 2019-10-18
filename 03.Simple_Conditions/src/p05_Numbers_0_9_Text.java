import java.util.Scanner;

        public class p05_Numbers_0_9_Text {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());

        if (first == 0) {
            System.out.println("Null");
        }
        else if (first == 1) {
            System.out.println("One");
        }
        else if (first == 2) {
            System.out.println("Two");
        }
        else if (first == 3) {
            System.out.println("Three");
        }
        else if (first == 4) {
            System.out.println("Four");
        }
        else if (first == 5) {
            System.out.println("Five");
        }
        else if (first == 6) {
            System.out.println("Six");
        }
        else if (first == 7) {
            System.out.println("Seven");
        }
        else if (first == 8) {
            System.out.println("Eight");
        }
        else if (first == 9) {
            System.out.println("Nine");
        }
        else if  (first >= 10) {
            System.out.println("number too big");
        }
    }
}
/*
Да се напише програма, която чете цяло число в диапазона [0…10], въведено от потребителя, и го изписва с
думи на английски език. Ако числото е извън диапазона, изписва “number too big”.
 */