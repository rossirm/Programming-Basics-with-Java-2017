import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double leva = Double.parseDouble(scanner.nextLine());


        double euro = leva / 1.95583;


        System.out.println(euro);
        }
    }
