import java.util.Scanner;

public class PoolPipes_222 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int v = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double H = Double.parseDouble(scan.nextLine());

        double water = (p1 * H) + (p2 * H);

        if (water <= v) {
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.",
                    Math.floor(water / v * 100),
                    Math.floor(p1 * H / water * 100),
                    Math.floor(p2 * H / water * 100));
        } else {
            System.out.printf("For %.1f hours the pool overflows with %.1f liters.", H, water - v);
        }
    }
}
/*
Да се отпечата на конзолата едно от двете възможни състояния:
 До колко се е запълнил басейна и коя тръба с колко процента е допринесла. Всички проценти се
свеждат до цяло число (без закръгляне).
o &quot;The pool is [x]% full. Pipe 1: [y]%. Pipe 2: [z]%.&quot;
 Aко басейнът се е препълнил – с колко литра е прелял за даденото време, число с плаваща запетая,
форматирано до първия знак след десетичната запетая.
o &quot;For [x] hours the pool overflows with [y] liters.&quot;

* Имайте предвид, че поради свеждането до цяло число се губят данни и нормално сборът на процентите
да е 99%, а не 100%.
Примерен вход и изход
Вход Изход Обяснения
1000
100
120
3
The pool is 66% full. Pipe 1: 45%. Pipe 2: 54%. За 3 часа:

Първата тръба е напълнила – 300 л.
Втората тръба е напълнила – 360 л.
Общо – 660 л. &lt; 1000 л. =&gt; 66% са
запълнени
Първата тръба е допринесла с 45%
(300 от 660 л.).
Втората тръба е допринесла с 54%
(360 от 660 л.).

100
100
100
2.5
For 2.5 hours the pool overflows with 400.0
liters.

За 2.5 часа:
Първата тръба е напълнила – 250 л.
Втората тръба е напълнила – 250 л.
Общо – 500 л. &gt; 100 л. =&gt; 400 л. са
преляли.
 */