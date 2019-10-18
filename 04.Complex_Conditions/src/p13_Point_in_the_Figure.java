import java.util.Scanner;

public class p13_Point_in_the_Figure {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        if ((x > h) & (x < 2 * h) & (y == h)) {
            System.out.println("inside");
        } else if ((x>=h) &(x<=2*h)&(y>=h)&(y<=4*h)) {
            if ((x>h)&(x<2*h)&(y>h)&(y<4*h)) {
                System.out.println("inside");
            } else if ((x>=h)&(x<=2*h) || (y>=h)&(y<=4*h)) {
                System.out.println("border");
            }
        } else if ((x>=0)&(x<=3*h)&(y>=0)&(y<=h)) {
            if ((x > 0) & (x < 3 * h) & (y > 0) & (y < h)) {
                System.out.println("inside");
            }else if ((x >= 0) & (x <= 3 * h) || (y >= 0) & (y <= h)) {
                System.out.println("border");
            }
        } else {
            System.out.println("outside");
        }
    }
}
/*
Фигура се състои от 6 блокчета с размер h * h, разположени като на фигурата вдясно. Долният ляв ъгъл на сградата е на позиция {0, 0}. Горният десен ъгъл на фигурата е на позиция {2*h, 4*h}. На фигурата координатите са дадени при h = 2.
Напишете програма, която чете цяло число h и координатите на дадена точка {x, y} (цели числа), въведени от потребителя, и отпечатва дали точката е вътре във фигурата (inside), вън от фигурата (outside) или на някоя от стените на фигурата (border).
Подсказки:
•	Може да разделите фигурата на два правоъгълника с обща стена.
•	Една точка е външна (outside) за фигурата, когато е едновременно извън двата правоъгълника.
•	Една точка е вътрешна (inside) за фигурата, ако е вътре в някой от правоъгълниците (изключвайки стените им) или лежи върху общата им стена.
•	В противен случай точката лежи на стената на правоъгълника (border)

 */