import java.util.Scanner;

public class p15_The_song_of_the_wheels {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int m = Integer.parseInt(scan.nextLine());
        int ctr = 0;
        String password = null;
        for (int i = 1; i <= 9; i++)
            for (int j = 1; j <= 9; j++)
                for (int k = 1; k <= 9; k++)
                    for (int l = 1; l < 9; l++)
                        if (i < j && k > l)
                        {
                            int calculation = i * j + k * l;
                            if (calculation == m)
                            {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                                ctr++;
                                if (ctr == 4)
                                    //System.out.printf("password = %d%d%d%d", i, j, k, l);
                                    password = String.valueOf(i) + String.valueOf(j)
                                            + String.valueOf(k) + String.valueOf(l); //"{i}{j}{k}{l}";
                            }
                        }
        if (ctr > 0)
            System.out.println();
        if (password != null)
            System.out.println("Password: " + password);
        else
            System.out.println("No!");
    }
}
/*
Прапраправнукът на Сали Яшар е получил наследство - сейф с парола - четири цифри. В него е заключена тайната на пеещите каруци. Той има автосервиз и се нуждае от реклама, затова е решил да направи такава каруца. Проблема е, че паролата е скрита в следната задача:
„Парола ще получиш, ако знаеш  едно цяло число, контролна стойност  се нарича то,
почива в интервала от 4 до 144 включително, но да го откриеш може би ще е мъчително. ”
Паролата има формат: „abcd“ и контролната стойност трябва да е равна на  a*b + c*d , но трябва да бъдат спазени следните условия:
•	при намирането на а и b: a < b
•	при намиране на  c и d: c > d .
Каруцата  има четири колела, затова паролата ще е четвърто число, което трябва да се отпечата.
В случай, че НЕ се намери такова число,  отпечатва се „No!“.
Вход
От конзолата се четe едно цяло число (контролната стойност): M – цяло число в интервала [4 … 144];
Изход
Отпечатването на конзолата зависи от резултата:
•	Ако са намерени четворки числа (аbcd), отговарящи на условието, ги отпечатваме всичките с разделител интервал: “{а}{b}{c}{d} ”
•	Отпечатва се един от двата реда на нов ред:
•	Ако съществува четвърта четворка се отпечатва: „Password: {а}{b}{c}{d}“
•	Ако НЕ са намерени такива числа или няма  четвърта четворка отпечатваме: “No!”
 */