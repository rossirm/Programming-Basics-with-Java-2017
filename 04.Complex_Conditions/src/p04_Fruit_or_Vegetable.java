import java.util.Scanner;

public class p04_Fruit_or_Vegetable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String productname = scan.nextLine().toLowerCase();

        if (productname.equals("banana") || productname.equals("apple") || productname.equals("kiwi")
                || productname.equals("cherry") || productname.equals("lemon")
                || productname.equals("grapes")) {
            System.out.println("fruit");
        } else if (productname.equals("tomato") || productname.equals("cucumber")
                || productname.equals("pepper") || productname.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
/*
Да се напише програма, която чете име на продукт, въведено от потребителя, и проверява дали е плод или
зеленчук.
 Плодовете &quot;fruit&quot; са banana, apple, kiwi, cherry, lemon и grapes
 Зеленчуците &quot;vegetable&quot; са tomato, cucumber, pepper и carrot
 Всички останали са &quot;unknown&quot;
Да се изведе „fruit“, „vegetable“ или „unknown“ според въведения продукт.
 */
