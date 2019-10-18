import java.util.Scanner;

public class p02_ExcellentOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 5.50) {
            System.out.println("Excellent!");
        }
        else {
            System.out.println("Not excellent.");
        }
    }
}
/*
Следващата задача от тази тема е да се напише конзолна програма, която чете оценка (десетично число),
въведена от потребителя, и отпечатва “Excellent!”, ако оценката е 5.50 или по-висока, или “Not excellent.” в
противен случай.
 */