import java.time.DayOfWeek;
import java.util.Scanner;

public class p09_Day_of_Week {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int day = Integer.parseInt(scan.nextLine());
        switch (day) {
            case 1:
                System.out.println(DayOfWeek.MONDAY);
                break;
            case 2:
                System.out.println(DayOfWeek.TUESDAY);
                break;
            case 3:
                System.out.println(DayOfWeek.WEDNESDAY);
                break;
            case 4:
                System.out.println(DayOfWeek.THURSDAY);
                break;
            case 5:
                System.out.println(DayOfWeek.FRIDAY);
                break;
            case 6:
                System.out.println(DayOfWeek.SATURDAY);
                break;
            case 7:
                System.out.println(DayOfWeek.SUNDAY);
                break;
            default:
                System.out.println("Error!");
                break;

        }
    }
}
/*
Принтирайте името на деня на седмицата по номер на деня от (на английаки) [1...7] или
принтирайте “Error” за невалидно число.
 */