public class p02_1_to_1000_with_7 {
    public static void main(String[] args) {

        for (int i = 7; i <= 1000; i += 10) {
            //if (i%10 == 7) {
            //System.out.println(i);
            // }
            System.out.println(i);
        }
    }
}
/*
Напишете програма, която отпечатва числата в диапазона [1…1000], които завършват на 7.
Подсказка: можете да завъртите for-цикъл от 1 до 1000 и да проверите всяко число дали завършва на 7.
Едно число num завършва на 7, когато (num % 10 == 7).
 */