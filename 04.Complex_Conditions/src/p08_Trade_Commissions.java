import java.util.Scanner;

public class p08_Trade_Commissions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine().toLowerCase();
        double sales = Double.parseDouble(scan.nextLine());

        double commission = -1.0;

        if (city.equals("sofia")) {
            if (sales >= 0 && sales <= 500) commission = sales * 0.05;
            else if (sales > 500 && sales <= 1000) commission = sales * 0.07;
            else if (sales > 1000 && sales <= 10000) commission = sales * 0.08;
            else if (sales > 10000) commission = sales * 0.12;
        } else if (city.equals("varna")) {
            if (sales >= 0 && sales <= 500) commission = sales * 0.045;
            else if (sales > 500 && sales <= 1000) commission = sales * 0.075;
            else if (sales > 1000 && sales <= 10000) commission = sales * 0.1;
            else if (sales > 10000) commission = sales * 0.13;
        } else if (city.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) commission = sales * 0.055;
            else if (sales > 500 && sales <= 1000) commission = sales * 0.08;
            else if (sales > 1000 && sales <= 10000) commission = sales * 0.12;
            else if (sales > 10000) commission = sales * 0.145;

        }
        if (commission >= 0) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }
    }
}
/*
Фирма дава следните комисионни на търговците си според града, в който работят и обема на продажбите s:

Град 0 ≤ s ≤ 500 500 &lt; s ≤ 1 000 1 000 &lt; s ≤ 10 000 s &gt; 10 000
Sofia 5% 7% 8% 12%
Varna 4.5% 7.5% 10% 13%
Plovdiv 5.5% 8% 12% 14.5%

Напишете конзолна програма, която чете име на град (стринг) и обем на продажби (десетично число) ,
въведени от потребителя, и изчислява и извежда размера на търговската комисионна според горната
таблица. Резултатът да се изведе закръглен с 2 цифри след десетичната точка. При невалиден град или обем
на продажбите (отрицателно число) да се отпечата „error“.
Подсказки:
 Прочетете входа и обърнете града в малки букви (като в предходната задача).
 Първоначално задайте комисионна -1. Тя ще бъде променена, ако градът и ценовият диапазон бъдат
намерени в таблицата с комисионните.
 Използвайте вложени if проверки, за да изчислите комисионната според града и според обема на
продажбите. Може да си помогнете с кода по-долу:
 */