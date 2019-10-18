import java.util.Scanner;

public class p09_Vowels_Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String text = "Pesho";
        String text = scan.nextLine();
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            switch (symbol) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
                //default
            }
        }
        System.out.println(sum);
    }
}
/*
Да се напише програма, която чете текст (стринг), въведен от потребителя, и изчислява и отпечатва сумата от
стойностите на гласните букви според таблицата по-долу:
буква a e i o u
стойност 1 2 3 4 5
Подсказки:
 Прочетете входния текст s. Нулирайте сумата.
 Завъртете цикъл от 0 до s.Length-1 (дължината на текста -1).
 Проверете всяка буква s.charAt(i) дали е гласна и съответно добавете към сумата стойността й.
 */