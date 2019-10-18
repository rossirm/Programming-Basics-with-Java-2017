import java.util.Scanner;

public class p07_Fruit_Shop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine().toLowerCase();
        String day = scan.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = -1.0;

        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday")
                || day.equals("thursday") || day.equals("friday")) {
            if (fruit.equals("banana")) price = 2.50;
            else if (fruit.equals("apple")) price = 1.20;
            else if (fruit.equals("orange")) price = 0.85;
            else if (fruit.equals("grapefruit")) price = 1.45;
            else if (fruit.equals("kiwi")) price = 2.70;
            else if (fruit.equals("pineapple")) price = 5.50;
            else if (fruit.equals("grapes")) price = 3.85;

        } else if (day.equals("saturday") || day.equals("sunday")) {
            if (fruit.equals("banana")) price = 2.70;
            else if (fruit.equals("apple")) price = 1.25;
            else if (fruit.equals("orange")) price = 0.90;
            else if (fruit.equals("grapefruit")) price = 1.60;
            else if (fruit.equals("kiwi")) price = 3.00;
            else if (fruit.equals("pineapple")) price = 5.60;
            else if (fruit.equals("grapes")) price = 4.20;
        }
        if (price >= 0) {
            System.out.println(price * quantity);
        } else {
            System.out.println("error");
        }
    }
}
/*
Магазин за плодове през работните дни работи на следните цени:
плод banana apple orange grapefrui
t
kiwi pineapple grapes
цена 2.50 1.20 0.85 1.45 2.70 5.50 3.85
Събота и неделя магазинът работи на по-високи цени:
плод banana apple orange grapefrui
t
kiwi pineapple grapes
цена 2.70 1.25 0.90 1.60 3.00 5.60 4.20
Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple /
grapes), ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday) и количество
(десетично число) , въведени от потребителя, и пресмята цената според цените от таблиците по-горе. При
невалиден ден от седмицата или невалидно име на плод да се отпечата „error“.

 */