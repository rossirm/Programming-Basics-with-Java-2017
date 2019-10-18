import java.util.Scanner;

public class p11_USDtoBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double usd = Double.parseDouble(console.nextLine());
        double bgn = usd * 1.79549;
        //double number = Math.round(deg);

        System.out.printf("%.2f BGN", bgn);
        //Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN). Закръглете резултата до 2 цифри след десетичната запетая. Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.
    }
}
