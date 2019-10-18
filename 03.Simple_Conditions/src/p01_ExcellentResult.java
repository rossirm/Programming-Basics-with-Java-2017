import java.util.Scanner;

public class p01_ExcellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}
/*
Първата задача от тази тема е да се напише конзолна програма, която чете оценка (десетично число),
въведена от потребителя, и отпечатва “Excellent!”, ако оценката е 5.50 или по-висока.
 */